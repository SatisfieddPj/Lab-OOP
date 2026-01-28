/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Lap7_3;

/**
 *
 * @author Achoo_QwQ
 */
public abstract class Player {
    private double ATK;
    private double EXP;
    private double HP;
    private double MP;
    private double Money;
    
    public double getATK() {
        return ATK;
    }
    public double getEXP() {
        return EXP;
    }
    public double getHP() {
        return HP ;
    }
    public double getMP() {
        return MP;
    }
    public double getMoney() {
        return Money ;
    }
    
    public void setATK(double ATK) {
        this.ATK = ATK;
    }
    public void seEXPt(double EXP) {
        this.EXP = EXP;
    }
    public void setHP(double HP) {
        this.HP = HP;
    }
    public void setMP(double MP) {
        this.MP = MP;
    }
    public void setMoney(double Money) {
        this.Money = Money;
    }
    
    public abstract void attack(Player p);
    public abstract void attacked(double n);
    
    @Override
    public String toString() {
        return "";
    }
}
