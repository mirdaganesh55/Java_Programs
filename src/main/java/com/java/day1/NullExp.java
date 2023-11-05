package com.java.day1;

public class NullExp {
	public static void main(String[] args) {
		int[] arr = null;
		try {
			int value = arr[0];
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println("Null object is Passed...");
		}
	}
}
