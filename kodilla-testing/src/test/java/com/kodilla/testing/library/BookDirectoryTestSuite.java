package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;

public class BookDirectoryTestSuite {


    private List<Book> generateListOfNBooks(int n){
        String title = "";
        String author="";
        int publishementYear=0;
        List<Book> newList = new ArrayList<>();
        for(int i=0; i<n; i++){
            title="Title" + i;
            author = "Author" + i;
            publishementYear= 2000 + i;

            newList.add(new Book(title, author, publishementYear));

        }
        return newList;
    }


    //czy lista ksiazek spelniajacych warunek wyszukiwania jest poprawnie zwracana
    @Test
    public void testListBooksWithConditionsReturnList() {
        //given
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary= new BookLibrary(libraryDatabaseMock);
        List<Book> testList = new ArrayList<>();
        Mockito.when(libraryDatabaseMock.listBookWithCondition("title")).thenReturn(testList);
        Book book1 = new Book("title1", "author1", 2001);
        Book book2 = new Book("title2", "author2", 2002);
        testList.add(book1);
        testList.add(book2);
        List<Book>thisList = bookLibrary.listBookWithCondition("title");

        Assert.assertEquals(2, thisList.size());
    }

    @Test
    public void testListOfBooksWithConditionMoreThan20(){

        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf0Books=new ArrayList<>();
        List<Book> listOf15Books=generateListOfNBooks(15);
        List<Book> listOf40Books=generateListOfNBooks(40);

        Mockito.when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(listOf15Books);
        Mockito.when(libraryDatabaseMock.listBookWithCondition("Zero")).thenReturn(listOf0Books);
        Mockito.when(libraryDatabaseMock.listBookWithCondition("toMany")).thenReturn(listOf40Books);

        List<Book> theListOf0Books=bookLibrary.listBookWithCondition("Zero");
        List<Book> theListOf15Books=bookLibrary.listBookWithCondition("Anything");
        List<Book> theListOf40Books=bookLibrary.listBookWithCondition("toMany");

        Assert.assertEquals(0, theListOf0Books.size());
        Assert.assertEquals(15, theListOf15Books.size());
        Assert.assertEquals(0, theListOf40Books.size());

    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){

       LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
       BookLibrary bookLibrary= new BookLibrary(libraryDatabaseMock);
       List<Book> testList ;
       testList=generateListOfNBooks(10);
       Mockito.when(libraryDatabaseMock.listBookWithCondition("Ab")).thenReturn(testList);
       List<Book> theList = new ArrayList<>();
       theList = bookLibrary.listBookWithCondition("Ab");

        Assert.assertEquals(0, theList.size());
        Mockito.verify(libraryDatabaseMock, Mockito.times(0)).listBookWithCondition(anyString());

    }


    @Test
    public void testListBooksHandsOfWhenUserHasNoOneBook(){
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> theListLibraryDatabase = new ArrayList<>();
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "123456789");
        Mockito.when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListLibraryDatabase);
        List<Book> theListBookLibrary ;
        theListBookLibrary= bookLibrary.listBooksInHandsOf(libraryUser1);
        Assert.assertEquals(0, theListBookLibrary.size());
    }

    @Test
    public void testListBooksHandsOfWhenUserHasOneBook(){
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "123456789");
        List<Book> theListLibraryDatabase = new ArrayList<>();
        Book testBook = new Book("Title", "Author" , 2000);
        theListLibraryDatabase.add(testBook);
        Mockito.when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListLibraryDatabase);
        List<Book>theListBookLibrary = bookLibrary.listBooksInHandsOf(libraryUser1);
        Assert.assertEquals(1, theListBookLibrary.size());
    }

    @Test
    public void testListBooksHandsOfWhenUserHasFiveBooks(){
        LibraryDatabase libraryDatabaseMock = Mockito.mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "123456789");
        List<Book> theListLibraryDatabase = generateListOfNBooks(5);
        Mockito.when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListLibraryDatabase);
        List<Book>theListBookLibrary = bookLibrary.listBooksInHandsOf(libraryUser1);
        Assert.assertEquals(5, theListBookLibrary.size());
    }

}
