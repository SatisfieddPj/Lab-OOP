/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab09_02;

/**
 *
 * @author noopo
 */
import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame fr;
    private JLabel label1, label2;
    private JPanel panel1, panel2, panel3, panel4;
    private JTextField txt1, txt2;
    private JButton bn_Deposit, bn_Withdraw, bn_Exit;
    private Account acct;

    public TellerGUI() {
        acct = new Account(6000, "User");
        
        fr = new JFrame("Teller GUI");
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        txt1 = new JTextField(String.valueOf(acct.getBalance()));
        txt1.setEditable(false);
        txt2 = new JTextField();
        bn_Deposit = new JButton("Deposit");
        bn_Withdraw = new JButton("Withdraw");
        bn_Exit = new JButton("Exit");

        panel1.setLayout(new GridLayout(1, 2));
        panel2.setLayout(new GridLayout(1, 2));
        panel3.setLayout(new FlowLayout());
        panel1.add(label1);
        panel1.add(txt1);
        panel2.add(label2);
        panel2.add(txt2);
        panel3.add(bn_Deposit);
        panel3.add(bn_Withdraw);
        panel3.add(bn_Exit);

        fr.setLayout(new GridLayout(4, 1));
        fr.add(panel1);
        fr.add(panel2);
        fr.add(panel3);
        fr.add(panel4);
        
        TellerHandler handler = new TellerHandler(this, acct);

        bn_Deposit.addActionListener(handler);
        bn_Withdraw.addActionListener(handler);
        bn_Exit.addActionListener(handler);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    // getter for txt1 & txt2
    public JTextField getTxt1() { return txt1; }
    public JTextField getTxt2() { return txt2; }
}
