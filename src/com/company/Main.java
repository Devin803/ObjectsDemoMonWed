package com.company;

public class Main {

    public static void main(String[] args) {
//        var myAccount = new BankAccount();
//        var yourAccount = new BankAccount(2000, 0.05f);
//        myAccount.deposit(1000);
//        myAccount.addInterest();
//        yourAccount.addInterest();
//        System.out.println("Your account with ID: " + yourAccount.getAccountID()+
//                " currently has a balance of: " + yourAccount.checkBalance());
//        var didSucceed = myAccount.withdraw(2000);
//            if(didSucceed)
//                System.out.println("You successfully made a withdrawal");
//            else
//                System.out.println("You could not withdraw from account number: " +myAccount.getAccountID() +
//                        ", current balance is: " + myAccount.checkBalance());
        var comp152Bank = new Bank();
        comp152Bank.doBanking();
        }
    }

