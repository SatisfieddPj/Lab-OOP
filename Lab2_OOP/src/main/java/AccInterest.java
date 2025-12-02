/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */

import java.util.Scanner;
public class AccInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money: ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char accType = sc.next().charAt(0);

        switch (accType) {
            case 'A', 'C' -> money += money * 0.15;
            case 'B' -> money += money * 0.02;
            case 'X' -> money += money * 0.05;
            default -> System.out.println("Invalid account type. No interest applied.");
        }
        System.out.print("Your total money in one year = " + money);
    }
}
