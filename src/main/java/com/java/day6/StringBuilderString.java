package com.java.day6;

public class StringBuilderString {
    public static void main(String[] args) {
        // Input text to be processed
        String text = "Hello, World!";
        
        // Split the input text into words using whitespace as the separator
        String[] words = text.split("\\s");
        
        // Create a StringBuilder to build the reversed text
        StringBuilder reversedText = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]);
            
            // Add a space between words if it's not the last word
            if (i > 0) {
                reversedText.append(" ");
            }
        }
        
        // Print the original 
        System.out.println("Original: " + text);
        //and reversed text
        System.out.println("Reversed: " + reversedText.toString());
    }
}
