/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab12;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author Achoo_QwQ
 */
public class StudentViewHandler implements ActionListener, WindowListener {
    private Student student;
    private JTextField txt_id;
    private JTextField txt_name;
    private JTextField txt_money;
    
    public StudentViewHandler(Student st, JTextField txt_name, JTextField txt_id, JTextField txt_mn) {
        this.student = st;
        this.txt_id = txt_id;
        this.txt_name = txt_name;
        this.txt_money = txt_mn;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command == "Deposit") {
            System.out.println("Depositing...");
            student.deposit(100);
            
        } else if (command == "Withdraw") {
            System.out.println("Withdrawing...");
            student.withdraw(100);

        }
        txt_money.setText("" + student.getMoney());
    }
    
    
    @Override
    public void windowOpened(WindowEvent e) {
        String output = "";
        String id_str = "";
        String name_str = "";
        String money_str = "";
        int read_count = 0;
        
        File f = new File("StudentM.dat");
        if (f.exists()) {
            try (FileReader fr = new FileReader("StudentM.dat")) {
                int i = fr.read();
                
                while (i != -1) {
                    System.out.println(i);
                    output += (char) i;
                    i = fr.read();
                    if (i == '\n') {
                        if (read_count == 0) {
                            id_str = output;
                            read_count += 1;
                            output = "";
                        }
                        else if (read_count == 1) {
                            name_str = output;
                            read_count += 1;
                            output = "";
                        } else if (read_count > 1) {
                            money_str = output;
                            read_count += 1;
                            output = "";
                        }
                        i = fr.read();
                    }
                }
                fr.close();
                
                student.setID(id_str);
                student.setName(name_str);
                student.setMoney(money_str);
                
                txt_id.setText(id_str);
                txt_name.setText(name_str);
                txt_money.setText(money_str);

                System.out.println("Reading successful");
            }
            catch (IOException er) {
                System.out.println(er);
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        student.setID(txt_id.getText().strip());
        student.setName(txt_name.getText().strip());
        student.setMoney(txt_money.getText().strip());
        
        String id_str = "" + student.getID();
        String name_str = "" + student.getName();
        String money_str = "" + student.getMoney();
        
        String out = id_str + name_str + money_str;
        System.out.println(out);

        try(FileWriter fw = new FileWriter("StudentM.dat")) {
            for (int i = 0; i < out.length(); i++) {
                if (i == id_str.length() || i == (id_str.length()+name_str.length())) {
                    fw.write("\n");
                }
                    fw.write(out.charAt(i));
            }
            fw.write("\n");
            
            System.out.println("Writing successful");
        }
        catch (IOException er) {
            System.out.println(er);
        }
        System.exit(0);
    }
    
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
