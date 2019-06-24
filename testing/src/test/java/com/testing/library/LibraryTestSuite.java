package com.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class LibraryTestSuite {

    // test if method returns correctly the list of books which met the condition
    @Test
    public void testListOfBooksWithConditionReturnList(){
        // given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        Library library = new Library(libraryDatabaseMock);
        List<Book> list = new ArrayList<>();
        Book book1 = new Book("title #1", "author #1", 2012);
        Book book2 = new Book("title #2", "author #2", 2010);
        Book book3 = new Book("title #3", "author #3", 2015);
        Book book4 = new Book("title #4", "author #4", 2000);
        Book book5 = new Book("title #5", "author #5", 2002);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        when(libraryDatabaseMock.listBooksWithCondition("title")).thenReturn(list);

        // when
        List<Book> theListOfBooks = library.listOfBooksWithCondition("title");

        // then
       // assertTrue(false);
    }

    // test if method returned an empty list when condition was met by more than 20 books
    @Test
    public void testListOfBooksWithConditionMoreThan20(){
        assertTrue(false);
    }

    // test if method returned an empty list when the condition (fragment of title) is shorter than 3 letters
    @Test
    public void testListOfBooksWithConditionLessThan3(){
        assertTrue(false);
    }

}