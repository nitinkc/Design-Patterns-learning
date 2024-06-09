package com.uml.a2association.bothway;

// User class representing a user
public class User {
    private Email email;

    // Constructor
    public User(Email email) {
        this.email = email;
    }

    // Method to send an email
    public void sendEmail(String content) {
        System.out.println("Sending email: " + content);
        email.send(content);
    }
}
