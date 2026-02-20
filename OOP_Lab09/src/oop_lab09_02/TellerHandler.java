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

public class TellerHandler implements ActionListener {
    private TellerGUI gui;
    private Account account;

    public TellerHandler(TellerGUI gui, Account account) {
        this.gui = gui;
        this.account = account;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        double amount = 0;
        try {
            amount = Double.parseDouble(gui.getTxt2().getText());
        } catch (NumberFormatException ex) {
            // mai tum a rai
        }

        if (command.equals("Deposit")) {
            account.deposit(amount);
        } else if (command.equals("Withdraw")) {
            account.withdraw(amount);
        } else if (command.equals("Exit")) {
            System.exit(0);
        }

        // update gui
        gui.getTxt1().setText(String.valueOf(account.getBalance()));
        gui.getTxt2().setText("");
    }
}