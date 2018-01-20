package com.company;

public class BankAccount {
    public int baNumber;
    public String baOwner;
    public double baBalance;


    public BankAccount(String name, int account, double balance) {
        //constructor
        this.baBalance = balance;
        this.baNumber = account;
        this.baOwner = name;
        System.out.println("New bank account for " + baOwner + " was created (" + baNumber + ")");
    }

    public double withdraw(double amount) {
        baBalance = baBalance - amount;
        return baBalance;
    }

    public double deposit(double amount) {
        baBalance = baBalance + amount;
        return baBalance;
    }
}
