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

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (-1 to stop): ");
        int input = sc.nextInt(), min = input, max = input;
        if (input == -1) {
            System.out.println("No numbers were entered.");
        } else {
            do {
                System.out.print("Enter a number (-1 to stop): ");
                input = sc.nextInt();
                if (input == -1)
                    break;
                if (input > max)
                    max = input;
                else if (input < min)
                    min = input;
            } while (input != -1);
            System.out.println("\nMaximum = " + max);
            System.out.println("Minimum = " + min);
        }
    }
}
