/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.Scanner;
public class PC_Build {
    public static void main(String[] args) {
        double total = 375.99;
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int DVD_ROM = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = sc.nextInt();
        
        System.out.println("======= Your oder =======");
        System.out.println("* computer >>> $375.99");
       
        switch (monitor) {
            case 38 -> {System.out.println("* 38'Monitor >>> $75.99");
                        total += 75.99; }
            case 43 -> {System.out.println("* 43'Monitor >>> $99.99");
                        total += 99.99; }
        }
        
        if (DVD_ROM == 1) {
            System.out.println("* DVD-Rom >>> $65.99");
            total += 65.99;
        }
        
        if (printer == 1) {
            System.out.println("* Printer >>> $125.00");
            total += 125.00;
        }
        
        System.out.println("======= Total price >>> " + total + " =======");
    }
}
