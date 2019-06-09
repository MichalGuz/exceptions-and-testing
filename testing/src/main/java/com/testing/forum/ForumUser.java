package com.testing.forum;

public class ForumUser {
    private String name;
    private String realName;

    public ForumUser(String name, String realName){
        // name visible on forum
        this.name = name;
        // real name of the user
        this.realName = realName;
    }
}
