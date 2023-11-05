package com.java.day1;

public class ArithExp {
	
	public static void main(String[] args) {
		int arr[] = new int [] {2,3,5};
		try {
			int a = arr[2]/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
			System.err.println("Cannnot be Divisible...");
		}
	}
}
