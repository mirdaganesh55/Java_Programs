package com.java.day6;
public class Reverse {
    // Method to reverse a given string
    public static String reverseString(String str) {
        // Convert the input string to a character array
        char[] arr = str.toCharArray();
        // Initialize variables for the start and end positions
        int start = 0;
        int end = arr.length - 1;
        // Temporary variable to store characters during swapping
        char temp;

        // Start a loop that continues until the end position is greater than the start position
        while (end > start) {
            // Swap characters at the start and end positions
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move the start position forward
            start++;
            // Move the end position backward
            end--;
        }

        // Convert the reversed character array back to a string and return it
        return new String(arr);
    }

    public static void main(String[] args) {
        // Example usage of the reverseString method and printing the result
        System.out.println(reverseString("Shailendra"));
    }
}
