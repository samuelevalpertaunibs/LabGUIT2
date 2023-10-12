package it.unibs.pajc;

import javax.swing.*;
import java.awt.EventQueue;

public class LabGUIT2 extends JFrame {

    private JPanel MainPanel;
    private JLabel lblInfo;
    private JSlider slider1;

    public LabGUIT2() {
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        add(MainPanel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LabGUIT2 frame = new LabGUIT2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
