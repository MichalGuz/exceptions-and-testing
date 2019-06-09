package com.testing.forum;

public class ForumComment {
    public ForumPost forumPost;
    public String commentBody;
    public String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }
}
