package com.exceptions.nullpointer;

public class NullpointerRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        messageSender.sendMessageTo(user, "Hello!");
    }
}
