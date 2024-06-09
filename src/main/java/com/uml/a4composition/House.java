package com.uml.a4composition;

import java.util.ArrayList;
import java.util.List;

// House class representing a house component
public class House {
    // List of rooms in the house (Composition relationship)
    private List<Room> rooms;

    // Constructor
    public House() {
        //(Composition relationship)
        this.rooms = new ArrayList<>();// Assume a house always starts with no rooms
    }

    // Method to add a room to the house (part of composition)
    public void addRoom(Room room) {
        rooms.add(room);//Not using setter
    }

    // Method to remove a room from the house (part of composition)
    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    // Method to get all rooms in the house
    public List<Room> getRooms() {
        return rooms;
    }
}
