package com.java.day1;

	public class StringReverse {
	    public static void main(String[] args) {
	        String text = "Java Programming";
	        String reversed = "";
	        for (int i = text.length() - 1; i >= 0; i--) {
	            reversed += text.charAt(i);
	        }
	        System.out.println("Reversed String: " + reversed);
	    }
	}

	
