package com.java.oops;

public class EnumEx2 {
	public static void main(String[] args) {
		String str="DOTNET";
		// Convert String to Enum 
		Course course = Course.valueOf(str);
		System.out.println(course);
	}
}
