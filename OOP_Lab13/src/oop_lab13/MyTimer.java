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

public class MyTimer extends JLabel implements Runnable {

    private int totalSeconds = 0;

    @Override
    public void run() {
        while (true) {
            int hour = totalSeconds / 3600;
            int min = (totalSeconds % 3600) / 60;
            int sec = totalSeconds % 60;

            this.setFont(new Font("Tahoma", Font.BOLD, 40));

            String timeStr = String.format("%02d:%02d:%02d", hour, min, sec);
            this.setText(timeStr);

            try {
                Thread.sleep(1000);
                totalSeconds++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
