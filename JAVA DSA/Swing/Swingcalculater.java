import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField num1, num2;
    JLabel result;
    JButton add, sub, mul, div, mod;

    public SimpleCalculator() {

        setTitle("Simple Calculator");
        setSize(350, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("First Number:"));
        num1 = new JTextField(15);
        add(num1);

        add(new JLabel("Second Number:"));
        num2 = new JTextField(15);
        add(num2);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);

        result = new JLabel("Result: ");
        add(result);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double ans = 0;

        if (e.getSource() == add)
            ans = a + b;
        else if (e.getSource() == sub)
            ans = a - b;
        else if (e.getSource() == mul)
            ans = a * b;
        else if (e.getSource() == div)
            ans = a / b;
        else if (e.getSource() == mod)
            ans = a % b;

        result.setText("Result: " + ans);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
