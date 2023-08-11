package com.JavaGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton addButton;
    private JButton subButton;
    private JButton a0Button;
    private JButton a6Button;
    private JButton cButton;
    private JButton a3Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton divideButton;
    private JButton pointButton;
    private JButton button11;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton equalButton;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;
    private JLabel lable;

    double ans, num;
    int calculation;

    public void arithmetic_operation() {
        try {
            switch (calculation) {
                case 1:
                    ans = num + Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(ans));
                    break;

                case 2:
                    ans = num / Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(ans));
                    break;

                case 3:
                    ans = num * Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(ans));
                    break;

                case 4:
                    ans = num - Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(ans));
                    break;
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public Cal() {
        lable.setText("");
//        lable.setVisible(false);
        ONRadioButton.setEnabled(false);
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(textField1.getText());
                    calculation = 1;
                    textField1.setText("");
                    lable.setText(num + "+");
                } catch (NumberFormatException addition) {
                    addition.getMessage();
                }

            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(textField1.getText());
                    calculation = 4;
                    textField1.setText("");
                    lable.setText(num + "-");
                } catch (NumberFormatException subtraction) {
                    subtraction.getMessage();
                }

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(textField1.getText());
                    calculation = 3;
                    textField1.setText("");
                    lable.setText(num + "*");
                } catch (NumberFormatException multiplication) {
                    multiplication.getMessage();
                }

            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(textField1.getText());
                    calculation = 2;
                    textField1.setText("");
                    lable.setText(num + "/");
                } catch (NumberFormatException d) {
                    d.getMessage();
                }
            }
        });
        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + ".");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });
        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                int number = textField1.getText().length() - 1;
                String store;

                if (length > 0) {
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textField1.setText(store);
                }
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                lable.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cal");
        frame.setContentPane(new Cal().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public void disable() {
        textField1.setEnabled(false);
        ONRadioButton.setEnabled(true);
        OFFRadioButton.setEnabled(false);
        textField1.setText("");
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        xButton.setEnabled(false);
        addButton.setEnabled(false);
        subButton.setEnabled(false);
        divideButton.setEnabled(false);
        pointButton.setEnabled(false);
        equalButton.setEnabled(false);
        cButton.setEnabled(false);
        button11.setEnabled(false);
        lable.setText("");
    }

    public void enable() {
        textField1.setEnabled(true);
        ONRadioButton.setEnabled(false);
        OFFRadioButton.setEnabled(true);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        xButton.setEnabled(true);
        addButton.setEnabled(true);
        subButton.setEnabled(true);
        divideButton.setEnabled(true);
        pointButton.setEnabled(true);
        equalButton.setEnabled(true);
        cButton.setEnabled(true);
        button11.setEnabled(true);
    }
}
