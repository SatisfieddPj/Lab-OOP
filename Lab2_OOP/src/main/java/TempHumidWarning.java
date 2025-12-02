/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
import java.util.*;
public class TempHumidWarning {
    public static void main(String[] args) {
        double temp;
        int humid;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (\u00B0C): "); //\u00B0 is degree symbol na kub
        temp = sc.nextDouble();
        System.out.print("Enter humidity (%): ");
        humid = sc.nextInt();
        
        if (temp > 37.5) {
            System.out.println("Warning: High temperature!");
        } else {
            System.out.println("Temperature normal.");
        }
        
        if (humid > 80) {
            System.out.println("Humidity is too high.");
        } else {
            System.out.println("Humidity is acceptable.");
        }
    }
}
