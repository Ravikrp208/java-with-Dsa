import javax.swing.*;
import java.awt.event.*;

public class mywindow {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Window");

        JButton button = new JButton("Click Me");
        button.setBounds(120, 100, 120, 40);

        // Button Click Event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}