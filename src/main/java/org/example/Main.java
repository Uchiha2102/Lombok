package org.example;

public class Main {
    public static void main(String[] args) {

        // Students
        Student student = new Student(1, "Harry Potter", "Hauptstrasse 8", 10);
        Student student2 = new Student(2, "Thomas Raven ", "Friedrichstrasse 10", 8);

        // Teacher
        Teacher teacher = new Teacher(1, "Alex Cross", "Computer science");

        //Course
        Course course = new Course(1, "Computer science", teacher);

        //Getter test
        System.out.println("Student Name " + student.getName());
        System.out.println("Course Name : " + course.getName());

        //Setter test
        student.setGrade(9);
        System.out.println("Updated Student Grade: " + student.getGrade());
        course.setName("Computer science + Java");
        System.out.println("Course Name : " + course.getName());


        // toString() testen
        System.out.println("\nTeacher: " + teacher);
        System.out.println("Student 1: " + student);
        System.out.println("Student 2: " + student2);
        System.out.println("Course: " + course);

    }
}