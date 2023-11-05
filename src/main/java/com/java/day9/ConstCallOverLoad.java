package com.java.day9;

public class ConstCallOverLoad {
	
	ConstCallOverLoad() {
		this("2nd Constructor is Called...");
		System.out.println("Java");
	}
	ConstCallOverLoad(String s){
		this(10,"Called");
		System.out.println(s);
	}
	ConstCallOverLoad(int a ,String s){
		System.out.println(a);
	}
	public static void main(String[] args) {
		new ConstCallOverLoad();
	}
}
