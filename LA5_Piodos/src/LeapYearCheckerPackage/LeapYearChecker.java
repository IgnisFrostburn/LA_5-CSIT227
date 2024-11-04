package LeapYearCheckerPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField YearTF;
    private JPanel panelMain;
    private JButton checkYearButton;

    LeapYearChecker() {
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(YearTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Enter year");
                } else {
                    int year = Integer.parseInt(YearTF.getText());
                    if(year % 4 == 0) {
                        if(year % 100 == 0) {
                            if(year % 400 == 0) {
                                JOptionPane.showMessageDialog(null, "Leap year");
                            } else {
                                JOptionPane.showMessageDialog(null, "Not a leap year");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Leap year");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearChecker l = new LeapYearChecker();
        l.setContentPane(l.panelMain);
        l.setSize(new Dimension(300, 200));
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
}
