package com.exceptions.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) {
        System.out.println("Sending message: " + message + " to: " + user.getName() );
    }
}
