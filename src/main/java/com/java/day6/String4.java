package com.java.day6;

import java.util.Arrays;

public class String4 {
    public static void main(String[] args) {
        // Two strings to check for anagrams
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = false;
        
        // Check if the lengths of the two strings are equal
        if (str1.length() == str2.length()) {
            // Convert both strings to character arrays
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();
            
            // Sort the character arrays
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            
            // Compare the sorted arrays to check if they are equal (anagrams)
            isAnagram = Arrays.equals(chars1, chars2);
        }
        
        // Print whether the two strings are anagrams
        System.out.println("Are Anagrams: " + isAnagram);
    }
}
