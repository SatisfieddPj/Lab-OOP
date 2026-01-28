/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Lap7_2;

/**
 *
 * @author Achoo_QwQ
 */
public class Ship extends Vehicle implements Floatable {
    public Ship() {
        super(0.0);
    }
    public Ship(double fuel) {
        super(fuel);
    }
    
    @Override
    public void fl0at() {
        double fuel_now = this.getFuel();
        if (fuel_now >= 50) {
            this.setFuel(fuel_now - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override
    public void startEngine() {
        double fuel_now = this.getFuel();
        if (fuel_now >= 10) {
            this.setFuel(fuel_now - 50);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    
    public void move() {
        fl0at();
    }
    public void move(int distance) {
        for (int i = 1; i <= distance; i++) {
            this.move();
        }
    }
}
