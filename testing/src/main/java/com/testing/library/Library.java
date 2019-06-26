package com.testing.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    LibraryDatabase libraryDatabase;

    public Library(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listOfBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<>();
        Book temporaryBook = new Book("temporary", "nobody", 2000);
        bookList.add(temporaryBook);

        // temporarily return list of one book
        return bookList;
    }
}
