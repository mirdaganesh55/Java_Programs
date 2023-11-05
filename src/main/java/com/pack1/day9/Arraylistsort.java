package com.pack1.day9;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistsort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");

        // Sort the ArrayList in ascending order (lexicographically)
        Collections.sort(names);

        // Now, the 'names' ArrayList is sorted
        for (String name : names) {
            System.out.println(name);
        }
    }
}
