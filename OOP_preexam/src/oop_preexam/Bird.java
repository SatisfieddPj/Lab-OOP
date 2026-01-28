/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_preexam;

/**
 *
 * @author noopo
 */
public abstract class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        this.setName(name);
        this.setPower(150);
        this.setAge(age);
    }
    
    public abstract void wingAttack(Animal a);
}
