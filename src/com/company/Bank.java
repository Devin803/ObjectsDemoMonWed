package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> allAccounts;
    private ArrayList<Customer> allCustomers;

    public Bank(){
        allCustomers = new ArrayList<Customer>();
        allAccounts = new ArrayList<BankAccount>();
    }
    public void doBanking(){
       var inputReader = new Scanner(System.in);
       while(true){
           printMenu();
           var userChoice = inputReader.nextInt();
           switch (userChoice){
               case 1:
                   System.exit(0);
               case 2:
                   addCustomer(inputReader);
                   break;
               case 3:
                   System.out.println("Not yet implemented");
                   break;
           }
       }
    }

    private void addCustomer(Scanner inputReader) {
        System.out.println("We need to add a customer, which isnt implemented yet");

    }

    private void printMenu() {
        System.out.println("What do you want to do next: ");
        System.out.println(" [1] Exit the program");
        System.out.println(" [2] Add a new Customer");
        System.out.println(" [3] Get help");
        System.out.print("Type the number of options you want: ");
    }

}

