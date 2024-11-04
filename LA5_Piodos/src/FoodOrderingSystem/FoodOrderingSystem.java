package FoodOrderingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JLabel FoodLabel;
    private JLabel DiscountLabel;
    private JPanel panelMain;
    private JCheckBox cPizza;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    FoodOrderingSystem() {
        int[] prices = {100, 80, 55, 55, 50, 40};
        JCheckBox[] food = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0, totalPrice = 0;
                for(JCheckBox j : food) {
                    if(j.isSelected()) {
                        totalPrice += prices[i];
                    }
                    i++;
                }
                if(rbNone.isSelected()) {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + totalPrice);
                } else if(rb5.isSelected()) {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + totalPrice*.950);
                } else if(rb10.isSelected()) {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + totalPrice*.900);
                } else if(rb15.isSelected()) {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + totalPrice*.850);
                } else {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + totalPrice);
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem f = new FoodOrderingSystem();
        f.setContentPane(f.panelMain);
        f.setSize(new Dimension(400, 400));
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
