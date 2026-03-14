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

public class Poring implements Runnable {

    private JFrame frame;
    private JLabel label;
    private ImageIcon image;
    private int count;

    public Poring(int count) {
        this.count = count;
        ImageIcon originalIcon = new ImageIcon("poring.png");

        Image img = originalIcon.getImage();
        Image scaledImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        ImageIcon resizedIcon = new ImageIcon(scaledImg);

        frame = new JFrame();
        label = new JLabel(String.valueOf(count), resizedIcon, JLabel.CENTER);

        frame.add(label);
        frame.setTitle("Poring");
        frame.setSize(200, 150);
        frame.setResizable(false); 

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });

        int x = (int) (Math.random() * 800);
        int y = (int) (Math.random() * 600);
        frame.setLocation(x, y);
    }

    @Override
    public void run() {
        frame.setVisible(true);
    }
}
