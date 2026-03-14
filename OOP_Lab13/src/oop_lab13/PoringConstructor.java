/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab13;

/**
 *
 * @author Achoo_QwQ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoringConstructor {

    private JFrame mainFrame;
    private JButton addButton;
    private int poringCount = 0;

    public PoringConstructor() {
        mainFrame = new JFrame("Poring Constructor");
        addButton = new JButton("Add");

        
        mainFrame.setLayout(new FlowLayout());
        mainFrame.add(addButton);

        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                poringCount++;
                Poring p = new Poring(poringCount);
                Thread t = new Thread(p);
                t.start();
            }
        });

        mainFrame.setSize(300, 100);
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
