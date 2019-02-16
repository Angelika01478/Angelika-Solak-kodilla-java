package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;
import stream.book.Book;
import stream.book.BookDirectory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {

    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books= bookDirectory.getList();
        //then
        int numberOfPublicationAfter2007=0;
        for(Book book:  books){
           if( book.getYearOfPublication()>2007) numberOfPublicationAfter2007++;
        }
        Assert.assertEquals(3, numberOfPublicationAfter2007);

    }

    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books= bookDirectory.getList();
        //then
        long numberOfBooksPublishedAfter2007 = IntStream.range(0, books.size())
                .filter(n->books.get(n).getYearOfPublication()>2007)
                .count();

        Assert.assertEquals(3, numberOfBooksPublishedAfter2007);
    }

}
