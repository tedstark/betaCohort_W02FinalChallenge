package com.company;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public /*<--access modifer*/ static void main(String[] args) {
//         [x]For this application, I want you to build a bank account class that contains different pieces of information.
//         [x]The account should house a "Bank Account Number", "Account Holder Name", and "Balance".
//         [x]All three member fields should be set in the constructor method, using arguments to set the values.
//         [x]Make two methods named "Withdraw" and "Deposit".
//          [x]Withdraw should deduct money from the account,
//          [x]deposit should add money to the account.
//         [x]Both of the methods should accept an argument to alter the account.
//
//        [x]From the main application file, create a bank account for everyone in class.
//        [x]Then deposit $57,000 (the average starting salary of a developer).
//        [x]Log out the balance of each account.
//
//        Extras:
//        []After creating each of the accounts, store them all in an Array (try both ArrayList and BankAccount[]),
//          then use that array and a loop to deposit all of the money, as well as logging out each of the balances.
//        []Look up the 'for each' loop and try to apply that, rather than a 'fori' loop (we will cover this later in class).
//        []Look up 'getters and setters' and see if you can apply the concept (we will cover this later in class)

        int ba[] = new int[9];
        double bb[] = new double[9];
        DecimalFormat moneyFormat = new DecimalFormat("##.00");


        //create accounts
        BankAccount Account001 = new BankAccount("Jake T", 12345601, 50000.11);
        BankAccount Account002 = new BankAccount("Koddie B", 12345602, 50000.12);
        BankAccount Account003 = new BankAccount("Zech H", 12345603, 50000.13);
        BankAccount Account004 = new BankAccount("Lori T", 12345604, 50000.14);
        BankAccount Account005 = new BankAccount("Joan A", 12345605, 50000.15);
        BankAccount Account006 = new BankAccount("Kym H", 12345606, 50000.16);
        BankAccount Account007 = new BankAccount("Mark F", 12345607, 50000.17);
        BankAccount Account008 = new BankAccount("Manny A", 12345608, 50000.18);
        BankAccount Account009 = new BankAccount("Ted S", 12345609, 50000.19);
        System.out.println("");

        BankAccount[] accountList = {Account001,Account002,Account003,Account004,Account005,Account006,Account007,Account008,Account009};

//        //deposit amount into accounts, version 1
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account001.baNumber + ".");
//        Account001.deposit(57000.0);
//        System.out.println("New balance for account " + Account001.baNumber + " is $" + Account001.newBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account002.baNumber + ".");
//        Account002.deposit(57000.0);
//        System.out.println("New balance for account " + Account002.baNumber + " is $" + Account002.newBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account003.baNumber + ".");
//        Account003.deposit(57000);
//        System.out.println("New balance for account " + Account003.baNumber + " is $" + Account003.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account004.baNumber + ".");
//        Account004.deposit(57000);
//        System.out.println("New balance for account " + Account004.baNumber + " is $" + Account004.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account005.baNumber + ".");
//        Account005.deposit(57000);
//        System.out.println("New balance for account " + Account005.baNumber + " is $" + Account005.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account006.baNumber + ".");
//        Account006.deposit(57000);
//        System.out.println("New balance for account " + Account006.baNumber + " is $" + Account006.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account007.baNumber + ".");
//        Account007.deposit(57000);
//        System.out.println("New balance for account " + Account007.baNumber + " is $" + Account007.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account008.baNumber + ".");
//        Account008.deposit(57000);
//        System.out.println("New balance for account " + Account008.baNumber + " is $" + Account008.baBalance + ".");
//
//        System.out.println("");
//        System.out.println("Deposit $57000 into account " + Account009.baNumber + ".");
//        Account009.deposit(57000);
//        System.out.println("New balance for account " + Account009.baNumber + " is $" + Account009.baBalance + ".");
//
//        //deposit amount into accounts, version 2
//        for (int i = 0; i < accountList.length; i++) {
//            accountList[i].deposit(57000);
//            System.out.println("New balance for account " + accountList[i].baNumber + " is $" + accountList[i].baBalance + ".");
//        }

//        deposit amount into accounts, version 3
        for (BankAccount thisForLoopAccount : accountList) {
            thisForLoopAccount.deposit(57000);
            System.out.println("New balance for account " + thisForLoopAccount.baNumber + " is $" + thisForLoopAccount.baBalance + ".");
        }

//        ba[0]= (Account001.baNumber);
//        ba[1]= (Account002.baNumber);
//
//        bb[0]=(Account001.baBalance);
//        bb[1]=(Account002.baBalance);
//
//        System.out.println(Arrays.toString(ba));
//        System.out.println((Arrays.toString(bb)));


//        bb[0]=(Account001.baBalance);
//        System.out.println((Arrays.toString(bb)));

        System.out.println("");
        System.out.println("Have a nice day!");

    }
}
