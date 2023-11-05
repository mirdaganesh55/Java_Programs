package com.java.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection{
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(67);
        numbers.add(32);
        numbers.add(98);
        numbers.add(54);

        // Initialize variables to store the maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the list using a for loop
        for (int number : numbers) {
            // Update the maximum and minimum values using control statements
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        // Display the maximum and minimum values
        System.out.println("List of numbers: " + numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

