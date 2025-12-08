/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3_oop;

/**
 *
 * @author Achoo_QwQ
 */
import java.util.*;
public class PasswordGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter password: ");
            password = sc.next();
            if (!(password.equals("PASS2025")))
                System.out.println("Try again.");
        } while (!(password.equals("PASS2025")));
        System.out.print("Access granted");
    }
}
