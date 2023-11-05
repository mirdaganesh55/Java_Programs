package com.java.day1;

import java.util.Scanner;

public class NumExp {

	 public static void main(String[] args) {
//	        String[] arr = {"1", "2", "three"};
//	        for (String s : arr) {
//	            try {
//	                int value = Integer.parseInt(s); // Parsing a non-integer string
//	            } catch (NumberFormatException e) {
//	                System.err.println("Number format exception.");
//	            }
//	        }
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number : ");
		 String str = sc.next();
		 sc.close();
		 try {
//	here we are trying to convert the Str String into an integer a...
			long a = Long.parseLong(str);
			System.out.println("a = "+a);
//	
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.err.println("String Cannot be converted into   ");
		}
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
		 
	    }
} 
