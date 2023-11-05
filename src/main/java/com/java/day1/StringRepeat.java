package com.java.day1;
import java.util.Scanner;


public class StringRepeat {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        System.out.print("Enter the number of times to repeat: ");
	        int times = scanner.nextInt();
	        for (int i = 0; i < times; i++) {
	            System.out.println(input);
	        }
	    }
	

	
}
