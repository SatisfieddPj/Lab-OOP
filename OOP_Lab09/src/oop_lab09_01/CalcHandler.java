package oop_lab09_01;

import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noopo
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcHandler implements ActionListener {
    private JTextField display;
    
    private double firstNum = 0;
    private String operator = "";

    public CalcHandler(JTextField display) {
        this.display = display;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // clear
        if (command.equals("c")) {
            display.setText("");
            firstNum = 0;
            operator = "";
        } 
        
        // operator na
        else if (command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/")) {

            // 1. If we ALREADY have an operator, do the "old" math first!
            if (!operator.equals("")) {
                double secondNum = Double.parseDouble(display.getText());

                if (operator.equals("+")) {
                    firstNum += secondNum;
                } else if (operator.equals("-")) {
                    firstNum -= secondNum;
                } else if (operator.equals("x")) {
                    firstNum *= secondNum;
                } else if (operator.equals("/")) {
                    firstNum /= secondNum;
                }

                // The result of 12 * 2 (which is 24) is now stored in firstNum
            } else {
                // 2. If this is the VERY FIRST operator, just save the number
                firstNum = Double.parseDouble(display.getText());
            }

            // 3. Now, save the NEW operator they just clicked (+, -, etc.)
            operator = command;

            // 4. Clear the screen for the next number
            display.setText("");
        }
        
        // equal
        else if (command.equals("=")) {
            double secondNum = Double.parseDouble(display.getText());
            double result = 0;

            if (operator.equals("+")) result = firstNum + secondNum;
            else if (operator.equals("-")) result = firstNum - secondNum;
            else if (operator.equals("x")) result = firstNum * secondNum;
            else if (operator.equals("/")) result = firstNum / secondNum;

            // 3. Show the final answer
            display.setText("" + result);
            // RESET after calculation is finished
            firstNum = result;
            operator = "";
        } 
        
        // numbers
        else {
            // This handles the numbers 0-9
            display.setText(display.getText() + command);
        }
    }
}
