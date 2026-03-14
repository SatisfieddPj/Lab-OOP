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

public class MyTimerFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Timer");

        MyTimer timerLabel = new MyTimer();
        Thread t = new Thread(timerLabel);
        t.start();

        frame.add(timerLabel, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
