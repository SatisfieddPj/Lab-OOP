/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_preexam;

/**
 *
 * @author noopo
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner() {
        this("", null);
    }
    public Owner(String name) {
        this(name, null);
    }
    public Owner(Animal animal) {
        this("", animal);
        
    }
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
        
    }
    
    public String getName() {
        return name;
    }
    
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public void feedFood(Food f) {
        animal.eat(f);
    }
    
    @Override
    public String toString() {
        return ("Owner : name = "+ name +", Animal : name = "+ animal.getName() +", power = "+ animal.getPower() +", age = " + animal.getAge());
    }
    
    public void protectOwnerFrom(Animal a) {
        boolean isDog = animal instanceof Dog;
        boolean isPigeous = animal instanceof Pigeous;
        if (isDog) {
            ((Dog) animal).kick(a);
        } else if (isPigeous) {
            ((Pigeous) animal).wingAttack(a);
        }
    }
}
