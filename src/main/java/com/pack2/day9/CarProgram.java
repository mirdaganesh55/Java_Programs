package com.pack2.day9;

//Define a class named 'Car' to represent a car object
class Veh {
 String brand;  // Declare a string variable to store the car's brand
 String model;  // Declare a string variable to store the car's model

 // Define a method named 'startEngine' to print a message when the car's engine is started
 void startEngine() {
     System.out.println("Engine started for " + brand + " " + model);
 }
}

//Define a public class 'CarProgram' to contain the main method
public class CarProgram {
 public static void main(String[] args) {
     // Create an instance of the 'Car' class and store it in the variable 'myCar'
     Veh myCar = new Veh();

     // Set the 'brand' and 'model' attributes of 'myCar'
     myCar.brand = "Toyota";
     myCar.model = "Camry";

     // Call the 'startEngine' method of 'myCar' to start the car's engine and print a message
     myCar.startEngine();
 }
}



