package com.java.day3;

public class HS2 {
	
	
	public static void main(String[] args) 
	{
		
		HighSecurity obj = new HighSecurity();
//		calling private meth()...
//		obj.meth();
//		calling private variable...just remove private then CE will be gone...
//		System.out.println(obj.a);
//		calling private constructer...
//		Pconstr obj2 = new Pconstr();
//		calling the default AM here but we cant call this method from outside the package
		Default obj3 = new Default();
		obj3.meth();
//		calling Protected ... Outside the package it is nor possible..
		
	}
}
