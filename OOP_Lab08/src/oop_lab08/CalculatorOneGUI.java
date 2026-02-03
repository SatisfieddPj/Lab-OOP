/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab08;

/**
 *
 * @author Achoo_QwQ
 */
import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel panel;
    private JTextField txtf1, txtf2, txtf3;
    private JButton bn1, bn2, bn3, bn4;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        panel = new JPanel();
        txtf1 = new JTextField();
        txtf2 = new JTextField();
        txtf3 = new JTextField();
        bn1 = new JButton("add");
        bn2 = new JButton("substract");
        bn3 = new JButton("multiply");
        bn4 = new JButton("division");
        
        panel.setLayout(new FlowLayout());
        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bn4);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(txtf1);
        fr.add(txtf2);
        fr.add(panel);
        fr.add(txtf3);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
