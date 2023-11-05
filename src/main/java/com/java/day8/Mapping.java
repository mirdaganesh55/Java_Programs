package com.java.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        // Create a HashMap to store employee information (Employee ID as key and Employee Name as value).
        Map<Integer, String> employeeMap = new HashMap<>();

        // Adding key-value pairs to the HashMap.
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Eve");

        // Printing all employee names using the key set.
        System.out.println("Employee Names:");
        Set<Integer> employeeIds = employeeMap.keySet();
        for (int id : employeeIds) {
            String name = employeeMap.get(id);
            System.out.println("Employee ID " + id + ": " + name);
        }

        // Check if a specific employee ID exists in the HashMap.
        int searchId = 103;
        if (employeeMap.containsKey(searchId)) {
            String employeeName = employeeMap.get(searchId);
            System.out.println("Employee ID " + searchId + " belongs to: " + employeeName);
        } else {
            System.out.println("Employee ID " + searchId + " not found.");
        }

        // Remove an employee from the HashMap.
        int removeId = 102;
        if (employeeMap.containsKey(removeId)) {
            employeeMap.remove(removeId);
            System.out.println("Employee ID " + removeId + " has been removed.");
        } else {
            System.out.println("Employee ID " + removeId + " not found for removal.");
        }

        // Display the updated employee list.
        System.out.println("Updated Employee Names:");
        for (int id : employeeIds) {
            String name = employeeMap.get(id);
            System.out.println("Employee ID " + id + ": " + name);
        }
    }
}
