package org.example;

import lombok.*;

@Getter
@Setter
public class Subject {
    private String name;
    private RoomType roomType;

    public Subject(String name, RoomType roomType) {
        this.name = name;
        this.roomType = roomType;
    }
}

enum RoomType {
    LECTURE_ROOM,
    COMPUTER_ROOM
}
