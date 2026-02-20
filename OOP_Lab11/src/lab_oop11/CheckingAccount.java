/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_oop11;

/**
 *
 * @author Achoo_QwQ
 */

public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0.0, "");
        this.credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) throws WithdrawException {
        if (a > 0) {
            if (balance - a > 0) {
                balance -= a;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else {
                if ( (balance + credit - a) < 0 ) {
                    throw new WithdrawException("Account " + name + " has not enough money.");
                } else {
                    double b = a;
                    balance -= a;
                    credit += balance;
                    balance = 0;
                    System.out.println(b + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
                }
            }
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(String a) throws WithdrawException {
        double number = Double.parseDouble(a);
        withdraw(number);
    }

    @Override
    public String toString() {
        return ("The " + name + " account has " + balance + " baht and " + credit + " credits.");
    }
}