package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBookWithCondition(String titleFragment);

    //list of books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book from libraryUser
    //returns true when success
    //and return false when book us unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //returns all books borrowed by libraryUser
    //returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
