/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Lap7_2;

/**
 *
 * @author Achoo_QwQ
 */
public class Pigeon extends Bird {

    private static int numberOfPigeon;

    public Pigeon() {
        this(0.0, 0.0, 0.0);
    }

    public Pigeon(double wingSize, double weight, double height) {
        super(wingSize, weight, height);
        numberOfPigeon += 1;

    }

    public void eat(String food) {
        double pigeonW = this.getWeight();
        switch (food) {
            case "worm" ->
                this.setWeight(pigeonW + 0.5);
            case "seed" ->
                this.setWeight(pigeonW + 0.2);
            default ->
                System.out.println("Pigeon can eat only worm and seed.");
        }
    }

    @Override
    public String toString() {
        return ("Pigeon " + this.getWeight() + " kg and " + this.getHeight() + " cm. There are " + numberOfPigeon + " pigeons.");
    }

    @Override
    public void fly() {
        double pigeonW = this.getWeight();
        this.setWeight(pigeonW - 0.25);
        if (pigeonW >= 5) {
            System.out.println("Fly Fly");
        } else {
            System.out.println("I’m hungry.");
        }
    }

    @Override
    public void takeOff() {
        double pigeonW = this.getWeight();
        this.setWeight(pigeonW - 0.5);
        if (pigeonW >= 5) {
            System.out.println("Take Off");
        } else {
            System.out.println("I’m hungry.");
        }
    }

    @Override
    public void landing() {
        double pigeonW = this.getWeight();
        this.setWeight(pigeonW - 0.5);
        if (pigeonW >= 5) {
            System.out.println("Landing");
        } else {
            System.out.println("I’m hungry.");
        }
    }
}
