package com.java.day9;

public class MethodOverloading {
	public void meth1() {
		System.out.println(10);
	}
	protected final void meth1(int a) {
		System.out.println(20);
	}
	private int meth1(int a, int b) {
		System.out.println(30);
		return a+b;
	}
	String meth1(String s , int a) {
		System.out.println(40);
		return s;
	}
	void meth1(int a, String s) {
		System.out.println(50);
}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.meth1();
		obj.meth1(10);
		obj.meth1(10,20);
		obj.meth1("Java",2300);
		obj.meth1(65,"Good");
		System.out.println("------------");
		MethodOverloading.main(10);
		MethodOverloading.main("Gao");
	}
	public static void main(int a) {
		System.out.println("1st one called...");
	}
	public static void main(String s) {
		System.out.println("Second One is called...");
	}
}
