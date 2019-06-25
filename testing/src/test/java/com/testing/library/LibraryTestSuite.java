package com.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class LibraryTestSuite {

    // the method of automatically generating a list of books
    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for(int i = 1; i <= booksQuantity; i++){
            Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
            resultList.add(theBook);
        }
        return resultList;
    }

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
        when(libraryDatabaseMock.listBooksWithCondition("title #")).thenReturn(list);

        // when
        List<Book> theListOfBooks = library.listOfBooksWithCondition("title #");

        // then
        assertEquals(5, theListOfBooks.size());
    }

    // test if method returned an empty list when condition was met by more than 20 books
    @Test
    public void testListOfBooksWithConditionMoreThan20(){
        // given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        Library library = new Library(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf30Books = generateListOfNBooks(30);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("ThirtyBooks")).thenReturn(resultListOf30Books);

        // when
        List<Book> theListOfBooks0 = library.listOfBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = library.listOfBooksWithCondition("Any title");
        List<Book> theListOfBooks30 = library.listOfBooksWithCondition("ThirtyBooks");

        // then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(30, theListOfBooks30.size());
    }

    // test if method returned an empty list when the condition (fragment of title) is shorter than 3 letters
    @Test
    public void testListOfBooksWithConditionLessThan3(){
        // given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        Library library = new Library(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // when
        List<Book> theListOf10Books = library.listOfBooksWithCondition("Th");

        // then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
}
