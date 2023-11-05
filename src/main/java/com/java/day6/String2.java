package com.java.day6;

public class String2 {
    public static void main(String[] args) {
        // Input string to be reversed
        String original = "Hello, World!";
        // Initialize an empty string to store the reversed result
        String reversed ="";

        // Start a loop that iterates through the characters of the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // Append the character at position 'i' to the reversed string
            reversed += original.charAt(i);
        }
//      reversed="Bharti";
//        reversed+="s";
        // Print the reversed string
        System.out.println("Reversed: " + reversed);
    }
}
