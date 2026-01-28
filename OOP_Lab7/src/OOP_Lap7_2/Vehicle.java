/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Lap7_2;

/**
 *
 * @author Achoo_QwQ
 */
public abstract class Vehicle implements Dieselable {
    protected double fuel;
    
    public Vehicle() {
        this(0.0);
    }
    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public double getFuel() {
        return fuel;
    }
    
    public void addFuel(double fuel) {
        if (fuel > 0) {
            System.out.println("Fuel is empty.");
        } else {
            double fuel_now = this.getFuel();
            this.setFuel(fuel_now + fuel);
        }
    }
    
    public abstract void honk();
}
