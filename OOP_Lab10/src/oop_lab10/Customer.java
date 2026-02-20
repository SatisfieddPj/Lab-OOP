/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab10;

/**
 *
 * @author Achoo_QwQ
 */

public class Customer {
    private String firstName;
    private String lastName;
    private Account []acct;
    private int numOfAccount;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }

    public void addAccount(Account ac) {
        acct[numOfAccount] = ac;
        numOfAccount += 1;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName + " has " + numOfAccount + " accounts.");
    }

    public boolean equals(Customer c) {
        return ((firstName.equals(c.getFirstName())) && (lastName.equals(c.getLastName())));
    }
}