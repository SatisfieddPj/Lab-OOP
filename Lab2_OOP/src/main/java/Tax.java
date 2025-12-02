/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = sc.nextDouble(), tax;
        if (income > 50000) {
            tax = income * 0.1;
        } else {
            tax = income * 0.05;
        }
        System.out.print("Tax: " + tax);
    }
}
