package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public int baNumber;
    public String baOwner;
    public double baBalance;
    public double newBalance;
    //public ArrayList<Integer> accountList = new ArrayList<>();
    //DecimalFormat moneyFormat = new DecimalFormat("##.00");

    public BankAccount(String name, int account, double balance) {
        //constructor
        this.baBalance = balance;
        this.baNumber = account;
        this.baOwner = name;
        System.out.println("New bank account for " + baOwner + " was created (" + baNumber + ")");
        //accountList.add(account);
            }

    public double deposit(double amount) {
        newBalance = baBalance + amount;
        return newBalance;
    }
    public double withdraw(double amount) {
        baBalance = baBalance - amount;
        return baBalance;
    }

//    public ArrayList<Integer> getAccountList() {
//        System.out.println(accountList);
//        return accountList;

    }


