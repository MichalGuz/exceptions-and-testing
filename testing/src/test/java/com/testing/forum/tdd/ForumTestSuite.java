package com.testing.forum.tdd;

import com.testing.forum.ForumComment;
import com.testing.forum.ForumPost;
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
        ForumUser forumUser = new ForumUser("eva", "Eva Parker");
        ForumPost thePost = new ForumPost("hello boys", "eva");

        // when
        forumUser.addComment(thePost, "eva", "I'm only replying to photo posts.");

        // then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost(){
        // given
        ForumUser forumUser = new ForumUser("adamN", "Adam Novak");
        ForumPost thePost = new ForumPost("hello everybody!!!", "adamN");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        // when
        ForumPost retrievedPost = forumUser.getPost(0);

        // then
        Assert.assertEquals(thePost, retrievedPost);

    }

    @Test
    public void testGetComment(){
        // given
        ForumUser forumUser = new ForumUser("evaS", "Eva Smith");
        ForumPost thePost = new ForumPost("what's up", "evaS");
        ForumComment theComment = new ForumComment(thePost, "thanx 4 all likes", "evaS");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        // when
        ForumComment retrievedComment = forumUser.getComment(0);

        // then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting(){
        // given
        ForumUser forumUser = new ForumUser("evaS", "Eva Smith");
        ForumPost thePost = new ForumPost("what's up", "evaS");

        // when
        boolean result = forumUser.removePost(thePost);

        // then
        Assert.assertFalse(result);

    }

    @Test
    public void testOfRemovingCommentNotExisting(){
        // given
        ForumUser forumUser = new ForumUser("adamN", "Adam Novak");
        ForumPost thePost = new ForumPost("hello everybody!!!", "adamN");
        ForumComment theComment = new ForumComment(thePost, "hello world!", "adamN");

        // when
        boolean result = forumUser.removeComment(theComment);

        // then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemovePost(){
        // given
        ForumUser forumUser = new ForumUser("evaS", "Eva Smith");
        ForumPost thePost = new ForumPost("what's up", "evaS");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());


    }
}
