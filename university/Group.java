package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Group {
    private String name;
    private List<Student> students;
    private List<Subject> subjects;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }
}