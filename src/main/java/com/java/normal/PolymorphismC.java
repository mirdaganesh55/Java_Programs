package com.java.normal;

import java.util.ArrayList;
import java.util.List;

// Define a Person class with an introduce method
class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

// Define a Student class that extends the Person class
class Student extends Person {
    @Override
    void introduce() {
        System.out.println("I am a student.");
    }
}

// Main class to demonstrate polymorphism in collections
public class PolymorphismC {
    public static void main(String[] args) {
        // Create a list to hold instances of Person and Student
        List<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Student());

        // Iterate through the list and call the introduce method for each person
        for (Person person : people) {
            person.introduce();  // Calls the appropriate introduce method based on the object type
        }
        
        Person p = new Person();
        p.introduce();
        
       
       people.get(0).introduce();
    }
}
