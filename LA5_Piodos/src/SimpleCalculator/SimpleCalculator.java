package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JLabel num1;
    private JLabel num2;
    private JLabel result;
    private JTextField num1TF;
    private JTextField num2TF;
    private JTextField resultTF;
    private JComboBox operators;
    private JButton comRes;
    private JPanel panelMain;

    SimpleCalculator() {
        comRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1TF.getText().isEmpty() || num2TF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter numbers");
                } else {
                    int num1 = Integer.parseInt(num1TF.getText());
                    int num2 = Integer.parseInt(num2TF.getText());
                    System.out.println(num1 + " " + num2);
                    switch (operators.getSelectedIndex()) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Choose an operator pretty please");
                            break;
                        case 1:
//                            System.out.printf("Add");
                            resultTF.setText(Integer.toString(num1+num2));
                            break;
                        case 2:
//                            System.out.println("Sub");
                            resultTF.setText(Integer.toString(num1-num2));
                            break;
                        case 3:
//                            System.out.println("Mul");
                            resultTF.setText(Integer.toString(num1*num2));
                            break;
                        case 4:
//                            System.out.println("Div");
                            resultTF.setText(Integer.toString(num1/num2));
                            break;
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator l = new SimpleCalculator();
        l.setContentPane(l.panelMain);
        l.setSize(new Dimension(600, 300));
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
}
