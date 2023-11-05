package com.java.day5;

public class StringFunctions {
	
public static void main(String[] args) {
		
		String name = "Hello myself Jai Gora";
		System.out.println(name.charAt(6));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(4));
		System.out.println(name.substring(4,8)); 
		System.out.println(name.contains("He"));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Gora"));
		System.out.println(name.replace('a', 'd'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf('a'));
		
		//String name = "    Jai Gora    ";
		System.out.println(name.trim());
	}
	
}
