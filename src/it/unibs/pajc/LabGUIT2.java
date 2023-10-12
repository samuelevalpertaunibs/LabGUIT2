package it.unibs.pajc;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class LabGUIT2 extends JFrame {

    private JPanel MainPanel;
    private JLabel lblInfo;
    private JSlider slider;
    private JProgressBar progressBar;
    private JComboBox comboBoxColors;

    public LabGUIT2() {
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        add(MainPanel);

        /*slider.addChangeListener(e -> {
            lblInfo.setText(String.valueOf(slider.getValue()));
        });*/

        slider.addChangeListener(e -> {
            progressBar.setValue(slider.getValue());
        });

        HashMap<String, Color> colorMap = new HashMap<>();
        colorMap.put("Red", Color.RED);
        colorMap.put("Green", Color.GREEN);
        colorMap.put("Blue", Color.BLUE);
        colorMap.put("Yellow", Color.YELLOW);

        for (HashMap.Entry<String, Color> entry:
             colorMap.entrySet()) {
            comboBoxColors.addItem(entry.getKey());
        }

        comboBoxColors.addActionListener(e -> {
                Object selectedItem = comboBoxColors.getSelectedItem();
                lblInfo.setText(selectedItem.getKey().toString());
                lblInfo.setForeground(selectedItem.getValue());
        });

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
