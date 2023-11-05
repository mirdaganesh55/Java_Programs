package com.java.normal;

//Define the Vehicle class
class Vehicle {
 // Method to represent starting
 void start() {
     System.out.println("Vehicle is starting.");
 }
}

//Define the Car class which inherits from Vehicle
class Car extends Vehicle {
 // Method specific to Car class
 void accelerate() {
     System.out.println("Car is accelerating.");
 }
}

//Main class to run the program
public class VehicleInheritance {
 public static void main(String[] args) {
     // Create a Car object
     Car car = new Car();
     // Call the start method (inherited from Vehicle)
     car.start();
     // Call the accelerate method (specific to Car)
     car.accelerate();
 }
}
