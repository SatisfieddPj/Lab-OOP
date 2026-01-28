/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_preexam;

/**
 *
 * @author noopo
 */
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, 200, age);
    }
    
    @Override
    public void eat(Food f) {
        this.setPower(this.getPower() + (f.getPower() * 1));
    }
    
    public void kick(Animal a) {
        this.setPower(this.getPower() - 10);
    }
}
