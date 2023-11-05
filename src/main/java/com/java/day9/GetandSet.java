package com.java.day9;

public class GetandSet {
	
	private String studentName;
	private int studentRollNo;
	
	public String getStudentName() {
		System.out.println("Step 3");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.err.println("Step 1");
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		System.out.println("Step 4");
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		System.err.println("Strp 2");
		this.studentRollNo = studentRollNo;
	}
	
	
}
