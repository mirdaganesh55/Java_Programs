package com.java.normal;

import java.util.HashMap;

public class HashmapExample1 {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs (String keys and Integer values)
        HashMap<String, Integer> scores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 76);

        // Access values by their keys
        int aliceScore = scores.get("Alice");
        int charlieScore = scores.get("Charlie");

        System.out.println("Alice's Score: " + aliceScore); // Output: Alice's Score: 95
        System.out.println("Charlie's Score: " + charlieScore); // Output: Charlie's Score: 76
    }
}
