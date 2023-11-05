package com.java.normal;

public class Encap1 {
    private double balance; // Encapsulated private variable for balance

    public Encap1() {
        balance = 0.0; // Initialize the balance to 0
    }

    public void deposit(double amount) {
        // Encapsulated method to deposit money
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited.");
        }
    }

    public void withdraw(double amount) {
        // Encapsulated method to withdraw money
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        // Encapsulated method to get the balance
        return balance;
    }

    public static void main(String[] args) {
        Encap1 account = new Encap1();

        // Testing the bank account operations
        account.deposit(100.0);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(50.0);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(70.0); // Attempt to withdraw more than the balance
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
