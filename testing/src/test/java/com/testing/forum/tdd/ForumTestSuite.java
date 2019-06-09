package com.testing.forum.tdd;

import com.testing.forum.ForumUser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("this is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    public void testAddPost(){
        // given
        ForumUser forumUser =new ForumUser("adam", "Adam Johnson");

        // when

        // then
    }
}
