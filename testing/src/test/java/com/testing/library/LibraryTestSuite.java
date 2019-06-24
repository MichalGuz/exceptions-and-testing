package com.testing.library;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;


public class LibraryTestSuite {

    // test if method returns correctly the list of books which met the condition
    @Test
    public void testListOfBooksWithConditionReturnList(){
        // given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        Library library = new Library(libraryDatabaseMock);

        assertTrue(false);
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
