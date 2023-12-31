package com.java.day5;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int result = 0;
		
		while(temp>0){
			int last = temp%10;
			result = result*10+last;
			temp = temp/10;
		}
		if(result==n){
			System.out.print("Yes it's a palindrome number");
		}
		else{
			System.out.print("No it's not a palindrome number");
		}
	}
	
}
