/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab12;

import java.awt.event.*;

/**
 *
 * @author Achoo_QwQ
 */
public class StudentViewHandler implements ActionListener, WindowListener {
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command == "Deposit") {
            
            
        } else if (command == "Withdraw") {
            
        }
    }
    
    
    @Override
    public void windowOpened(WindowEvent e) {
    }
    
    @Override
    public void windowClosing(WindowEvent e) {}
    
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}

}
