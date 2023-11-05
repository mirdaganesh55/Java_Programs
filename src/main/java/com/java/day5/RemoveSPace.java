package com.java.day5;

public class RemoveSPace {
	
	 public static void main(String[] args) {    
         
	        String str1="R e m o v e";    
	            
	        //Removes the white spaces using regex 
	        //REPLACE all space characters with blank using replaceAll()
	        str1 = str1.replaceAll("\\s+", "");  
	       
	        
	        //\\s is an escape sequence that represents a whitespace character
	        //\\s+ can be used to match sequences of one or more consecutive whitespace 
	            
	        System.out.println("String after removing all the white spaces : " + str1);    
	    }    
	
}
