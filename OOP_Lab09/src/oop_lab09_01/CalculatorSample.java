/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab09_01;

/**
 *
 * @author noopo
 */
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorSample {
    private JFrame fr;
    private JPanel panel;
    private JTextField txtf;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn0, bn_a, bn_s, bn_m, bn_d, bn_eq, bn_c;
    
    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        panel = new JPanel();
        txtf = new JTextField(1);
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bn0 = new JButton("0");
        bn_a = new JButton("+");
        bn_s = new JButton("-");
        bn_m = new JButton("x");
        bn_d = new JButton("/");
        bn_eq = new JButton("=");
        bn_c = new JButton("c");

        fr.setLayout(new BorderLayout());
        fr.add(txtf, BorderLayout.NORTH);
        fr.add(panel, BorderLayout.CENTER);
        
        panel.setLayout(new GridLayout(4, 4));
        panel.add(bn7);
        panel.add(bn8);
        panel.add(bn9);
        panel.add(bn_a);
        
        panel.add(bn4);
        panel.add(bn5);
        panel.add(bn6);
        panel.add(bn_s);

        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bn_m);

        panel.add(bn0);
        panel.add(bn_c);
        panel.add(bn_eq);
        panel.add(bn_d);
        
        CalcHandler sharedHandler = new CalcHandler(txtf);
        
        bn1.addActionListener(sharedHandler);
        bn2.addActionListener(sharedHandler);
        bn3.addActionListener(sharedHandler);
        bn4.addActionListener(sharedHandler);
        bn5.addActionListener(sharedHandler);
        bn6.addActionListener(sharedHandler);
        bn7.addActionListener(sharedHandler);
        bn8.addActionListener(sharedHandler);
        bn9.addActionListener(sharedHandler);
        bn0.addActionListener(sharedHandler);
        bn_a.addActionListener(sharedHandler);
        bn_s.addActionListener(sharedHandler);
        bn_m.addActionListener(sharedHandler);
        bn_d.addActionListener(sharedHandler);
        bn_eq.addActionListener(sharedHandler);
        bn_c.addActionListener(sharedHandler);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}


