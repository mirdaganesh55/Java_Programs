package com.java.day9;

import java.util.Scanner;

public class Enacapsulation {
	
	void display() {
		Scanner sc = new Scanner(System.in);
		GetandSet obj = new GetandSet();
		
		System.out.println("Enter Student Name :");
		obj.setStudentName(sc.next());
		
		System.out.println("Enter Student RollNo :");
		obj.setStudentRollNo(sc.nextInt());
		
		System.out.println("Name is : "+obj.getStudentName());
		System.out.println("Roll No is :"+obj.getStudentRollNo());
		sc.close();
	}
	public static void main(String[] args) {
		new Enacapsulation().display();
	}
}
