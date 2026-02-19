/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab09_02;

/**
 *
 * @author noopo
 */
import java.awt.event.*;
import javax.swing.*;

public class TellerHandler implements ActionListener {
    private TellerGUI gui; // Reference to the GUI to access its fields
    private Account account;

    public TellerHandler(TellerGUI gui, Account account) {
        this.gui = gui;
        this.account = account;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        // 1. Get the amount from the text field
        double amount = 0;
        try {
            amount = Double.parseDouble(gui.getTxt2().getText());
        } catch (NumberFormatException ex) {
            // If the box is empty or not a number, just do nothing
        }

        // 2. Perform the logic using the Account methods
        if (command.equals("Deposit")) {
            account.deposit(amount);
        } else if (command.equals("Withdraw")) {
            // Note: Your Account class already prints "Not enough money" to console
            // if balance < amount, so we just call the method.
            account.withdraw(amount);
        } else if (command.equals("Exit")) {
            System.exit(0);
        }

        // 3. Update the GUI to match the new account state
        gui.getTxt1().setText(String.valueOf(account.getBalance()));
        gui.getTxt2().setText(""); // Clear the amount box for next time
    }
}