/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP_Lap7_2;

/**
 *
 * @author Achoo_QwQ
 */
public class OOP_Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plane p1 = new Plane(200, "IT Airline", "FX-747");
        Ship s1 = new Ship(200);

        System.out.println("=== plane ===");
        p1.startEngine();
        p1.takeOff();
        p1.fly();
        p1.fly();
        p1.honk();
        p1.landing();
        p1.stopEngine();

        System.out.println("=== ship ===");
        s1.startEngine();
        s1.move(2);
        s1.honk();
        s1.stopEngine();
    }
    
}
