package com.java.day6;

import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        // The input sentence to be tokenized
        String sentence = "This is a sample sentence. Tokenization is important.";
        
        // Create a StringTokenizer object to tokenize the sentence
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        
        // Count the number of tokens (words) in the sentence
        int tokenCount = tokenizer.countTokens();
        System.out.println("Number of Tokens: " + tokenCount);
        
        // Iterate through the tokens and print each one
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}
