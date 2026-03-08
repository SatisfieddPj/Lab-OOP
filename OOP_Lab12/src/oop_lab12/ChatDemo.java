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

public class ChatDemo  {
    private JFrame frame;
    private JPanel panel1;
    private JTextArea txt_view;
    private JTextField txt_box;
    private JButton btn_sm, btn_rs;
    
    private String txt_history = "";
    private String txt_message = "";
    
    public ChatDemo() {
        frame = new JFrame();
        panel1 = new JPanel();
        txt_view = new JTextArea(txt_history, 20, 45);
        txt_view.setEditable(false);
        txt_box = new JTextField(txt_message, 45);
        btn_sm = new JButton("Submit");
        btn_rs = new JButton("Reset");
        
        panel1.setLayout(new FlowLayout());
        panel1.add(btn_sm);
        panel1.add(btn_rs);
        
        frame.setLayout(new BorderLayout());
        frame.add(txt_view, BorderLayout.NORTH);
        frame.add(txt_box, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.SOUTH);
        
        ChatHandler handler = new ChatHandler(txt_view, txt_box);
        
        btn_sm.addActionListener(handler);
        btn_rs.addActionListener(handler);
        txt_box.addKeyListener(handler);
        frame.addWindowListener(handler);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
