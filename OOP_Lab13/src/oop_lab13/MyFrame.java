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

public class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Clock");
        MyClock clock = new MyClock();
        
        Thread t = new Thread(clock);
        t.start();
        
        frame.add(clock, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
