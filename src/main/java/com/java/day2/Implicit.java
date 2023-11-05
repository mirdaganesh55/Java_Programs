package com.java.day2;

public class Implicit {
//	note :- Int and char data are compatible...
	static void meth1() {
		System.err.println("Performing Implicit type casting...");
		byte b = 1;
		int a1 = b;
		char c1 = 'A';
		char c2 = 'a';
		int a2 = c1;
		int a3 = c2;
		//int a =1; byte b= a;
		System.out.println("Byte Value : "+b);
		System.out.println("Integer Value :"+a1);
//		implicit type cast means converting
//		smaller data type to larger data type...
		System.out.println("Char Value : " +c1+ " " +c2);
		System.out.println("Implicit Integer Value : "+a2);
		System.out.println("Implicit Integer Value : "+a3);
		System.out.println("Called from meth()1 :"+new Implicit().meth2('a'));//65
	}
	int meth2(int x) {
		System.out.println("Implicit Value is called...");
		System.out.println(x+3);// 100
		return 'A';
	}
	// byte,short,int,long,float,double
	public static void main(String[] args) {
		meth1();
	}
}
