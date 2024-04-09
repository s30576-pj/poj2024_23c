package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", 10111);
        Student student2 = new Student("Anna", "Nowak", 20222);
        Student student3 = new Student("Katarzyna", "Han", 30333);
        Student student4 = new Student("Jakub", "Mak", 40444);
        Student student5 = new Student("Andrzej", "Blum", 50555);

        Group groupA = new Group("Group A");
        Group groupB = new Group("Group B");

        student1.addToGroup(groupA);
        student2.addToGroup(groupA);
        student3.addToGroup(groupB);
        student4.addToGroup(groupB);
        student5.addToGroup(groupA);
        student5.addToGroup(groupB);

        groupA.addSubject(new Subject("Programming", RoomType.COMPUTER_ROOM));
        groupB.addSubject(new Subject("Programming", RoomType.COMPUTER_ROOM));

        System.out.println("\nStudents in group " + groupA.getName() + ":");
        for (Student student : groupA.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " - " + student.getNumberStudent());
        }
        System.out.println("\nSubjects in group " + groupA.getName() + ":");
        for (Subject subject : groupA.getSubjects()) {
            System.out.println("Subject: " + subject.getName() + ", Room type: " + subject.getRoomType());
        }

        System.out.println("\nStudents in group " + groupB.getName() + ":");
        for (Student student : groupB.getStudents()) {
            System.out.println(student.getName() + " " + student.getSurname() + " - " + student.getNumberStudent());
        }
        System.out.println("\nSubjects in group " + groupB.getName() + ":");
        for (Subject subject : groupB.getSubjects()) {
            System.out.println("Subject: " + subject.getName() + ", Room type: " + subject.getRoomType());
        }
    }
}