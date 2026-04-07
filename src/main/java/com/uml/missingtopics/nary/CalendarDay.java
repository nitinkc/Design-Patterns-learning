package com.uml.missingtopics.nary;

import java.time.LocalDate;

public class CalendarDay {
    private final LocalDate date;

    public CalendarDay(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}

