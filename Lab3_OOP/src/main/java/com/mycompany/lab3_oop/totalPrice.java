/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_oop;

/**
 *
 * @author Achoo_QwQ
 */
import java.util.*;
public class totalPrice {
    public static void main(String[] args) {
        double total = 0, paid, change;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print("Enter price for item  " + i + ": ");
            total += sc.nextDouble();
        }
        System.out.println("Total = " + (int)total + "\n");
        System.out.print("Enter amount paid ");
        paid = sc.nextDouble();
        change = paid - total;
        if (change < 0)
            System.out.print("Does not recieve enough money for all items - short: " + Math.abs(change));
        else if (change == 0)
            System.out.print("Recieve the exact amount");
        else
            System.out.print("Change = " + (int)change);
    }
}