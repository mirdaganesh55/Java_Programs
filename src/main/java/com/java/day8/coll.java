package com.java.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coll {

	public static void main(String[] args) {
        List numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Collection Framework Example");
        System.out.println("1. Add number");
        System.out.println("2. Remove number");
        System.out.println("3. Display numbers");
        System.out.println("4. Exit");

        boolean exit = false;

        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add: ");
                     
                    numbers.add("string");
                    //System.out.println(numToAdd + " added to the list.");
                    break;

                case 2:
                    System.out.print("Enter a number to remove: ");
                    int numToRemove = scanner.nextInt();
                    
                        numbers.remove(Integer.valueOf(numToRemove));
                        System.out.println(numToRemove + " removed from the list.");
                    
                    break;

                case 3:
                    System.out.println("Numbers in the list: " + numbers);
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
        
	}
}
