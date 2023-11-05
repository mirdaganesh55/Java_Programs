package com.java.normal; // Package declaration

// Abstract class for shapes
abstract class Shape {
    // Abstract method for calculating the area
    abstract double area();
}

// Circle class inherits from Shape
class Circle extends Shape {
    private double radius; // Private variable for the circle's radius

    // Constructor to set the circle's radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate circle's area
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Square class inherits from Shape
class Square extends Shape {
    private double sideLength; // Private variable for the square's side length

    // Constructor to set the square's side length
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Overridden method to calculate square's area
    @Override
    double area() {
        return sideLength * sideLength;
    }
}

// Main class
public class Abstraction {
    // Main method
    public static void main(String[] args) {
        Circle circle = new Circle(3); // Create a Circle object with a radius of 3
        Square square = new Square(4); // Create a Square object with a side length of 4

        // Print the area of the circle
        System.out.println("Circle Area: " + circle.area());

        // Print the area of the square
        System.out.println("Square Area: " + square.area());
    }
}
