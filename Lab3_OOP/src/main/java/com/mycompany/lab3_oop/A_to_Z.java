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

public class A_to_Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, word = "", consonants = "";
        do {
            System.out.print("Enter a character: ");
            input = sc.next();
            if (input.equals("z")) {
                break;
            }
            
            if (!(input.matches("[a-z]")) || (input.length() > 1)) {
                System.out.println("Invalid input. Only 1 lowercase a-z are allowed.");
                input = "";
            }

            if (input.matches("[aeiou]")) {
                word += input;
            } else {
                word += input;
                consonants += input;
            }
        } while (!(input.equals("z")));
        System.out.println("\nAll characters entered: " + word);
        System.out.println("Consonants only: " + consonants);
    }
}
