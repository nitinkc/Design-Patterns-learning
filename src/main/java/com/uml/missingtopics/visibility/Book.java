package com.uml.missingtopics.visibility;

public class Book {
    private final String title;
    private Library homeLibrary;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Library getHomeLibrary() {
        return homeLibrary;
    }

    void setHomeLibrary(Library homeLibrary) {
        this.homeLibrary = homeLibrary;
    }
}

