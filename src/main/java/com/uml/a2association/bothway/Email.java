package com.uml.a2association.bothway;

// Email class representing an email
public class Email {
    private User recipient;

    // Constructor
    public Email(User recipient) {
        this.recipient = recipient;
    }

    // Method to send the email
    public void send(String content) {
        System.out.println("Email sent to user: " + recipient + " Content: " + content);
    }
}
