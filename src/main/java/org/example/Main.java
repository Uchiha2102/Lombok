package org.example;

public class Main {
    public static void main(String[] args) {

        //Builder
        Teacher teacher = Teacher.builder()
                .id(1)
                .name("Albert Einstein")
                .subject("physics")
                .build();

        Teacher updatedTeacher = teacher.withName("Albert Einstein++++");
        ;
        Student student1 = Student.builder()
                .id(1)
                .name("Toni Busch")
                .address("123 Hauptstrasse")
                .grade(10)
                .build();

        Student updatedStudent1 = student1.withAddress("Berliner Str 8");

        Student stundent2 = Student.builder()
                .id(1)
                .name("Ron Weasley")
                .address("123 Main St")
                .grade(10)
                .build();

        Course course = Course.builder()
                .id(5)
                .name("Algebra")
                .teacher(teacher)
                .build();
        Course updatedCourse = course.withName("Computer science");

        System.out.println("Original Teacher: " + teacher);
        System.out.println("Updated Teacher: " + updatedTeacher);

        System.out.println("Original Student: " + student1);
        System.out.println("Updated Student: " + updatedStudent1);

        System.out.println("Original Course: " + course);
        System.out.println("Updated Course: " + updatedCourse);
        System.out.println("NEW BRANCH");



    }
}