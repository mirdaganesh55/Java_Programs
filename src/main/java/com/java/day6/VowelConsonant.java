package com.java.day6;

public class VowelConsonant {
    public static void main(String[] args) {
        // Input string to analyze
        String str = "Hello, World!";
        // Convert the input string to lowercase
        str = str.toLowerCase();
        
        // Initialize variables to count vowels and consonants
        int vowels = 0, consonants = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i--) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Check if the character is a vowel (a, e, i, o, or u)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        // Print the counts of vowels and consonants
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
