/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_oop;

/**
 *
 * @author Achoo_QwQ
 */
public class Seller extends Employee {
    public Food sell(Employee e) {
        double buyerBalance = e.getWallet().getBalance();
        double sellerBalance = this.getWallet().getBalance();
        double foodPrice = Food.getPrice();
        Food f;
        
        if (buyerBalance >= foodPrice) {
            e.getWallet().setBalance((buyerBalance - foodPrice));
            this.getWallet().setBalance((sellerBalance + foodPrice));
            f = new Food();
        } else {
            System.out.println("Your money is not enough.");
            f = null;
        }
        return f;
    }
}
