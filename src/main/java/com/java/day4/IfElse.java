package com.java.day4;

public class IfElse {
	
	public static void main(String[] args) {
	    int number = 10;

	    // checks if number is greater than 0
	    if (number > 0) {
	      System.out.println("The number is positive.");
	    }
	    
	    // execute this block
	    // if number is not greater than 0
	    else {
	      System.out.println("The number is not positive.");
	    }

	    System.out.println("Statement outside if...else block");
	  }
	
	/*
	 *   public static void main(String args[]) {
        int year;
        System.out.println("Enter Year : ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
 
    }
	 */

}
