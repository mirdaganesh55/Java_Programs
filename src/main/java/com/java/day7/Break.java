package com.java.day7;

public class Break {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int searchValue = 3;
        boolean found = false;

        for (int number : numbers) {
            if (number == searchValue) {
                found = true;
                break; // Exit the loop when the value is found
            }
        }

        if (found) {
            System.out.println("Value found in the array.");
        } else {
            System.out.println("Value not found in the array.");
        }
    }
	
}
