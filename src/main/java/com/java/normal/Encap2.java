package com.java.normal;

public class Encap2 {
    private String name;  // Encapsulated private variable for student's name
    private int age;      // Encapsulated private variable for student's age

    public Encap2(String name, int age) {
        // Constructor to initialize the student's name and age
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // Encapsulated method to get the student's name
        return name;
    }

    public int getAge() {
        // Encapsulated method to get the student's age
        return age;
    }

    public void setAge(int age) {
        // Encapsulated method to set the student's age
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Create a student object and initialize it
        Encap2 student = new Encap2("Alice", 20);

        // Display student's information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Update the student's age
        student.setAge(21);
        System.out.println("Updated Student Age: " + student.getAge());
    }
}
