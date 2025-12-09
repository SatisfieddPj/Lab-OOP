package com.mycompany.lab3_oop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.*;

public class moneyDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deposit, total = 0, n = 0;

        do {
            if (total < 1000) {
                System.out.print("Enter deposit amount: ");
                deposit = sc.nextInt();
                n += 1;
                total += deposit;
            }
        } while (total < 1000);

        System.out.println("\nTarget reached!");
        System.out.println("Total amount saved = " + total);
        System.out.println("Number of deposits = " + n);
    }
}
