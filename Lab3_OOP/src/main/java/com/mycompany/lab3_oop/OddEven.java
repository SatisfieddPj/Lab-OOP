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
public class OddEven {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int num;
        int odd = 0, even = 0;
        do {
            num = sc.nextInt();
            
            if (num != -1) {
                if (num % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            }
        } while (num != -1);
        System.out.print("Odd number = " + odd + " and Even number = " + even);
    }
}
