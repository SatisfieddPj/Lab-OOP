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
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt(), Excellent = 0, Good = 0, Fair = 0, Poor = 0;
        double score;
        for (int i = 1; i<=students; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if (score >= 80) {
                System.out.println("Exellent");
                Excellent += 1;
            } else if (score >= 60 && score < 80) {
                System.out.println("Good");
                Good += 1;
            } else if (score >= 50 && score < 60) {
                System.out.println("Fair");
                Fair += 1;
            } else {
                System.out.println("Poor");
                Poor += 1;
            }
        }
        System.out.println("\nSummary:");
        System.out.println("Excellent: " + Excellent);
        System.out.println("Good: " + Good);
        System.out.println("Fair: " + Fair);
        System.out.println("Poor: " + Poor);
    }
}
