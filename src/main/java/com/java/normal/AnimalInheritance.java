package com.java.normal;

//Define the Animal class
class Animal {
 // Method to represent eating
 void eat() {
     System.out.println("Animal is eating.");
 }
}

//Define the Dog class which inherits from Animal
class Dog extends Animal {
 // Method specific to Dog class
 void bark() {
     System.out.println("Dog is barking.");
 }
}

//Main class to run the program
public class AnimalInheritance {
 public static void main(String[] args) {
     // Create a Dog object
     Dog dog = new Dog();
     // Call the eat method (inherited from Animal)
     dog.eat();
     // Call the bark method (specific to Dog)
     dog.bark();
 }
}

