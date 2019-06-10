package com.testing.forum;

public class ForumUser {
    private String name;
    private String realName;

    public ForumUser(String name, String realName){
        // name visible on forum
        this.name = name;
        //  real name of the user
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        // do nothing
    }

    public void addComment(ForumPost thePost, String author, String commentBody){
        // do nothing
    }

    public int getPostQuantity(){
        return 10;
    }

    public int getCommentsQuantity(){
        return 10;
    }

    public ForumPost getPost(int postNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public ForumComment getComment(int commentNumber){
        // returning null means that the operation was unsuccessful
        return null;
    }

    public boolean removePost(ForumPost thePost){
        //return true temporarily
        return true;
    }

    public boolean removeComment(ForumComment theComment){
        // return true temporarily
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
