/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Enter family income: ");
        double family_income = sc.nextDouble();
        
        if ( gpa >= 3.5 ) {
            if ( family_income <= 15000) {
                System.out.print("You are eligible for the scholarship.");
            } else {
                System.out.print("You are not eligible for a scholarship.");
            }
        } else {
            System.out.print("You are not eligible for a scholarship.");
        }
    }
}
