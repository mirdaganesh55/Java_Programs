package com.java.day5;

public class ReverseString {
	
	public static void main(String[] args) {      
		//take any string here i have taken hello world
		String str = "hello world";
		//taken a string s and finding the length of string that is 11
        int i = str.length()-1;  //11-1 = 10 so, i=10
        //taken empty string
        String ans = "";
          
        String words[]=str.split("\\s");  
        String reverseWord="";  
        
        //for each loop
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
       System.out.println(reverseWord.trim());
    }
	
}
