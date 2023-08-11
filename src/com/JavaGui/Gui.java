package com.JavaGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JTextField numb1Text;
    private JTextField numb2Text;
    private JTextField resultText;
    private JPanel topPanel;
    private JPanel buttonPanel;
    private JButton ADD;
    private JButton MOD;
    private JButton CLEAR;
    private JLabel firstName;
    private JLabel secondName;
    private JLabel result;
    private JPanel mainPanel;

    public Gui() {
        ADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numb1 = numb1Text.getText().trim();
                String numb2 = numb2Text.getText().trim();
                double result = Double.parseDouble(numb1) + Double.parseDouble(numb2);
                resultText.setText(result + "");
            }
        });
        MOD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numb1 = numb1Text.getText().trim();
                String numb2 = numb2Text.getText().trim();
                double result = Double.parseDouble(numb1) % Double.parseDouble(numb2);
                resultText.setText(result + "");
            }
        });
        CLEAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1Text.setText("");
                numb2Text.setText("");
                resultText.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Calculator");
        frame.setContentPane(new Gui().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
