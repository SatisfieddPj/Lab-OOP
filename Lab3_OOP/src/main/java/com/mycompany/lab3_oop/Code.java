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
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        String code = "";
        for (int i = 1; i<=n; i++) {
            System.out.print("Enter digits " + i + ": ");
            code += sc.next();
        }
        System.out.print("\nFinal Code = " + code);
    }
}
