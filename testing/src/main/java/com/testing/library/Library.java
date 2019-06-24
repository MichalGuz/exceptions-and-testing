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
        Book book = new Book("The book title", "The book author", 2010);
        bookList.add(book);

        // temporary return list of one book
        return bookList;
    }


}
