package com.java.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private String name;
    private int id;
    private String email;

    public Employee(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    
    

    // Getters and setters for the attributes (not shown for brevity)

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}

public class sortEmploybyname {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 1, "john@example.com"));
        employees.add(new Employee("Alice", 2, "alice@example.com"));
        employees.add(new Employee("Bob", 3, "bob@example.com"));
        employees.add(new Employee("Eve", 4, "eve@example.com"));

        // Sort the 'employees' ArrayList by name in ascending order using a custom Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        // Now, the 'employees' ArrayList is sorted by name
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
