/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab12;

/**
 *
 * @author Achoo_QwQ
 */
public class Student {
    private String name;
    private int ID;
    private int money;
    
    public Student() {
        this("", 0, 0);
    }
    
    public Student (String name,
                    int ID,
                    int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {return name;}
    
    public void setID(int id) {
        this.ID = id;
    }
    
    public int getID() {return ID;}
    
    public void withdraw(int amount) {
        money += amount;
    }
    
    public void deposit(int amount) {
        money -= amount;
    }
    
    public int getMoney() {return money;}
}
