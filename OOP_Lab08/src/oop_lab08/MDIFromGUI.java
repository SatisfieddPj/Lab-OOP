/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab08;

/**
 *
 * @author Achoo_QwQ
 */
import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, mi4, msi1, msi2;
    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 1", true, true, true, true);
        frame2 = new JInternalFrame("Application 2", true, true, true, true);
        frame3 = new JInternalFrame("Application 3", true, true, true, true);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        ms1 = new JMenu("New");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        
        m1.add(ms1);
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        
        frame1.pack();
        frame1.setVisible(true);
        
        int x2 = frame1.getX() + frame1.getWidth() + 50;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        frame2.pack();
        frame2.setVisible(true);
        
        int x3 = frame2.getX() + frame2.getWidth() + 50;
        int y3 = frame1.getY();
        frame3.setLocation(x3, y3);
        frame3.pack();
        frame3.setVisible(true);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        frame1.setSize(250, 200);
        frame2.setSize(250, 200);
        frame3.setSize(250, 200);

        fr.add(desktopPane, BorderLayout.CENTER);
        fr.setMinimumSize(new Dimension(800,600));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
