package com.java.day9;

import java.util.Scanner;

public class Encap {
	
	void display() {
		Scanner sc = new Scanner(System.in);
		DataEncap obj = new DataEncap();
		System.out.println("Enter Student Name: ");
		obj.studentName=sc.next();
		System.out.println("Enter Student Roll No:");
		obj.studentRollNo= sc.nextInt();
		System.out.println("Sname : "+obj.studentName);
		System.out.println("RollNo : "+obj.studentRollNo);
		sc.close();
	}
	
	public static void main(String[] args) {
	new Encap().display();
	}
}
