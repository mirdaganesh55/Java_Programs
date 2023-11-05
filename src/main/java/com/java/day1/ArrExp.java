package com.java.day1;

public class ArrExp {
	
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3};
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.err.println("Its Array Out of Bound...");
		}
		
	}
	
}
