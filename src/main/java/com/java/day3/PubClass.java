package com.java.day3;

public class PubClass {
	public void meth() {
		int a = 10;
		int b = 20;
		System.out.println("Public meth Called()...");
	}
	public static void main(String[] args) {
		new PubClass().meth();
	}
}
