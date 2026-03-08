/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab12;

/**
 *
 * @author Achoo_QwQ
 */
import java.awt.event.*;
import javax.swing.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.*;


public class ChatHandler implements ActionListener, KeyListener, WindowListener {
    
    private JTextArea history;
    private JTextField message;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public ChatHandler(JTextArea history, JTextField message) {
        this.history = history;
        this.message = message;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String history_string = history.getText();
        
        if (command == "Submit") {
            if ("".equals(history_string)) {
                history_string += dtf.format(LocalDateTime.now()) + ": " + message.getText();
            } else {
                history_string += "\n" + dtf.format(LocalDateTime.now()) + ": " + message.getText();
            }
            System.out.println("Message Submitted");
            history.setText(history_string);
        } else if ("Reset".equals(command)) {
            System.out.println("Reset Chat History");
            history.setText("");
        }
        message.setText("");
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        String history_string = history.getText();

        if (key == 10) {
            System.out.println("Enter key gotten pressed, submitting a message");
            if ("".equals(history_string)) {
                history_string += dtf.format(LocalDateTime.now()) + ": " + message.getText();
            } else {
                history_string += "\n" + dtf.format(LocalDateTime.now()) + ": " + message.getText();
            }
            System.out.println("Message Submitted");
            history.setText(history_string);
            message.setText("");
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
    
    
    @Override
    public void windowClosing(WindowEvent ev) {
        String history_string = history.getText();
        
        try (FileWriter fw = new FileWriter("ChatDemo.dat")) {
            for (int i = 0; i < history_string.length(); i++) {
                fw.write(history_string.charAt(i));
            }
            System.out.println("Writing successful");
          
        } catch (IOException e) {
            System.out.print(e);
        }
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent ev) {
        String history_string = history.getText();
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (FileReader fr = new FileReader("ChatDemo.dat")) {
                int i = fr.read();
                while (i != -1) {
                    System.out.println(i);
                    history_string += (char) i;
                    i = fr.read();
                }
                fr.close();
                System.out.println("Reading successful");
                history.setText(history_string);

            } catch (IOException e) {
                System.out.print(e);
            }
        }
        
    }
    
    @Override
    public void windowClosed(WindowEvent ev) {}
    @Override
    public void windowIconified(WindowEvent ev) {
    }@Override
    public void windowDeiconified(WindowEvent ev) {
    }@Override
    public void windowActivated(WindowEvent ev) {}
    @Override
    public void windowDeactivated(WindowEvent ev) {
    }
}
