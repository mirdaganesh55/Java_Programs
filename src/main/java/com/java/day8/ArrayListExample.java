package com.java.day8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
//        	type cast
            String fruit = (String) iterator.next();
            if (fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }
    }
}
