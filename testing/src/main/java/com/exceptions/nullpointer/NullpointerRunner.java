package com.exceptions.nullpointer;

public class NullpointerRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not send, but the programme is still running.");
        }
        System.out.println("Processing other logic.");
    }
}
