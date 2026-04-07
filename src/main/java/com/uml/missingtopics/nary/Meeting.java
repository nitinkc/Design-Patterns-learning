package com.uml.missingtopics.nary;

public class Meeting {
    private final Person host;
    private final Room room;
    private final CalendarDay day;

    public Meeting(Person host, Room room, CalendarDay day) {
        this.host = host;
        this.room = room;
        this.day = day;
    }

    public Person getHost() {
        return host;
    }

    public Room getRoom() {
        return room;
    }

    public CalendarDay getDay() {
        return day;
    }
}

