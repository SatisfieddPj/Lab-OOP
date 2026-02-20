package oop_lab10_03;
//
import oop_lab10_03.Account;

import oop_lab10_03.Account;
import oop_lab10_03.Customer;
import oop_lab10_03.Customer;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Bank myBank = new Bank();
//        
//        Account acct1 = new Account(5000, "Sommai");
//        Account acct2 = new Account(3000, "Somchai");
//        Account acct3 = new Account(900, "Somsri");
//        
//        myBank.addAccount(acct1);
//        myBank.addAccount(acct2);
//        myBank.addAccount(acct3);
//        
//        System.out.println("Number of Account: " + myBank.getNumAccount());
//        myBank.getAccount(0).showAccount();
//        System.out.println("Deposit 500...");
//        myBank.getAccount(0).deposit(500);
//        myBank.getAccount(0).showAccount();
//        System.out.println("Show all accounts");
//        System.out.println("==============================");
//        for (int i = 0; i < myBank.getNumAccount(); i++) {
//            myBank.getAccount(i).showAccount();
//        }
//    }
    
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "SCB");
        Account acct2 = new Account(5000, "KBank");

        cust.addAccount(acct1);
        cust.addAccount(acct2);
        
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        
        System.out.println(cust);
        
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}