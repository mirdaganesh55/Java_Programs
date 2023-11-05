package com.java.day9;

public class MethOverriding extends ClassA {
	void meth() {
		System.out.println("Class MethOvrriding is Called...");
	}
	public static void main(String[] args) {
		ClassA obj1 = new MethOverriding();
		obj1.meth();
		System.out.println("-----------");
		ClassA obj2 = new ClassA();
		obj2.meth();
	}
	public static void main() {
		main(null);
		main(null);
	}
} 
