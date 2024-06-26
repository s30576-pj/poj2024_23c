package org.example;

import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Getter
@Setter
public class Student {
    private String name;
    private String surname;
    private int numberStudent;
    private List<Group> groups;

    public Student(String name, String surname, int numberStudent) {
        this.name = name;
        this.surname = surname;
        this.numberStudent = numberStudent;
        this.groups = new ArrayList<>();
    }

    public void addToGroup(Group group) {
        if (group == null) {
            throw new IllegalArgumentException("The group cannot be null!");
        }
        groups.add(group);
        group.addStudent(this);
    }

    // Or:
//     public void addToGroup(@NonNull Group group) {
//        groups.add(group);
//        group.addStudent(this);
//    }


    public void removeToGroup(Group group) {
        if (group == null) {
            throw new IllegalArgumentException("The group cannot be null!");
        }
        groups.remove(group);
        group.removeStudent(this);
    }
}