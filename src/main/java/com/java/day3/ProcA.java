package com.java.day3;

public class ProcA {
	
	protected void meth() {
		System.out.println("Protected meth() is called..");
	}	
}
class ClassA extends ProcA{
	public static void main(String[] args) {
		new ProcA().meth();
	}
}
