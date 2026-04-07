package com.uml.missingtopics.visibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final List<Book> holdings = new ArrayList<>();

    public void addBook(Book book) {
        holdings.add(book);
        book.setHomeLibrary(this);
    }

    public void removeBook(Book book) {
        holdings.remove(book);
        book.setHomeLibrary(null);
    }

    public List<Book> getHoldings() {
        return Collections.unmodifiableList(holdings);
    }
}

