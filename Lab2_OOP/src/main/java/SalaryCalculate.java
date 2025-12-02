/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.next();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = sc.nextDouble();
        int salary = 0;

        if ( 21 <= age && age <= 30 ) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if ( 31 <= age && age <= 40 ) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if ( 41 <= age && age <= 50 ) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if ( 51 <= age && age <= 60 ) {
            salary = (numDay1 * 3000);
        }
        
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        
        if ( 10 <= weight && weight <= 60 ) {
            salary += 5000;
        } else if ( 10 <= weight && weight <= 60 ) {
            salary += 5000 - ((weight-60) * 10);
        }
        
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
}
