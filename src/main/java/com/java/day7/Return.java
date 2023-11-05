package com.java.day7;

public class Return {
	
    public static int addNumbers(int a, int b) {
        return a + b; // Return the sum of two numbers
    }
	
    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        System.out.println("Sum: " + result);
    }
}
