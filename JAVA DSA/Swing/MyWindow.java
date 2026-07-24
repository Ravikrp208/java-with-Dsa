import javax.swing.*;
import java.awt.event.*;

public class MyWindow {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("My First Window");

        // Create Button
        JButton button = new JButton("Click Me");
        button.setBounds(120, 100, 120, 40);

        // Button Click Event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add button to frame
        frame.add(button);

        // Frame properties
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}