import javax.swing.*;
import java.awt.event.*;

public class UserInput {

    public static void main(String[] args) {

        JFrame frame = new JFrame("User Input Example");

        JLabel label = new JLabel("Enter Your Name:");
        label.setBounds(30, 30, 120, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 150, 30);

        JButton button = new JButton("Submit");
        button.setBounds(100, 80, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}