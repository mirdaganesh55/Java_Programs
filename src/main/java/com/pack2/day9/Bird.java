package com.pack2.day9;

//Define a base class named 'Bird'
public class Bird {
 // Define the 'sound' method to print a generic message for bird sounds
 public void sound() {
     System.out.println("Bird sounds");
 }


//Define a class 'Pigeon' that extends the 'Bird' class
public class Pigeon extends Bird {
 // Override the 'sound' method to provide a specific sound for pigeons
 @Override
 public void sound() {
     System.out.println("Cooing");
 }
}

//Define a class 'Sparrow' that extends the 'Bird' class
public class Sparrow extends Bird {
 // Override the 'sound' method to provide a specific sound for sparrows
 @Override
 public void sound() {
     System.out.println("Chirp");
 }
}
}
