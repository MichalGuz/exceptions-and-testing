package com.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // list books having title beginning with fragment of title
    List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by LibraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for LibraryUser
    // return true when success
    // and return false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back
    int returnedBooks(LibraryUser libraryUser);
}
