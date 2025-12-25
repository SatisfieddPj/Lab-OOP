/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
public class Account {
    public double balance;
    public String name;
    public void deposit(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else {
            balance += b;
        }
    }
    public double withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
        } else if (b < balance) {
            System.out.println("Your account balance is insufficient.");
        } else {
            balance -= b;
            return b;
        }
    }
}
