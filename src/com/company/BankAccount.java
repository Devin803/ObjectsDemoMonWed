package com.company;

public class BankAccount{
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID = 1000;

    public BankAccount(){
        interestRate = 0.02f;
        accountID = nextID;
        nextID++;
    }
    public BankAccount(double initialBalance, float initialRate){
        balance = initialBalance;
        interestRate = initialRate;
        accountID = nextID;
        nextID++; //or nextID += 1
    }
    public void deposit(double amount){ //mutable
        balance = balance + amount;
    }
    public boolean withdraw(double amount){ //mutable
        if(balance < amount)
            return false;
        balance -= amount;
        return true;
    }
    public double checkBalance(){ //accessor
        return balance;
    }
    public double addInterest(){ //mutable and accessor
        var interest = balance*interestRate;
        balance += interest;
        return balance;
    }
    public int getAccountID(){
        return accountID;
    }
}
