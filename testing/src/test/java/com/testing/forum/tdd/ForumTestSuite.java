package com.testing.forum.tdd;

import com.testing.forum.ForumUser;
import org.junit.*;

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

    @Test
    public void testAddPost(){
        // given
        ForumUser forumUser = new ForumUser("adam", "Adam Johnson");

        // when
        forumUser.addPost("adam", "hi girls");

        // then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }

    @Test
    public void testAddComment(){
        // given

        // when

        // then
    }
}
