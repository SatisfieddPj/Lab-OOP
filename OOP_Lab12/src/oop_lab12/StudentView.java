/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab12;

/**
 *
 * @author Achoo_QwQ
 */

import java.awt.*;
import javax.swing.*;

public class StudentView {
    private Student student = new Student();
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel lb_id, lb_name, lb_mn;
    private JTextField txt_id, txt_name, txt_mn;
    private JButton btn_dps, btn_wthd;
    
    public StudentView() {
        
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        lb_id = new JLabel("ID:");
        lb_name = new JLabel("Name:");
        lb_mn = new JLabel("Money:");
        txt_id = new JTextField();
        txt_name = new JTextField();
        txt_mn = new JTextField(student.getMoney());
        txt_mn.setEditable(false);
        btn_dps = new JButton("Deposit");
        btn_wthd = new JButton("Withdraw");

        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(lb_id);
        panel1.add(txt_id);
        panel1.add(lb_name);
        panel1.add(txt_name);
        panel1.add(lb_mn);
        panel1.add(txt_mn);

        panel2.setLayout(new FlowLayout());
        panel2.add(btn_dps);
        panel2.add(btn_wthd);
        
        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        
        
        
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
