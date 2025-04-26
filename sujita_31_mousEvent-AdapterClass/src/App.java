import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum and Difference Calculator");

        // First number input
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(50, 50, 100, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 50, 150, 30);
        frame.add(textField1);

        // Second number input
        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(50, 100, 100, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 100, 150, 30);
        frame.add(textField2);

        // Output label
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 180, 300, 30);
        frame.add(resultLabel);

        // Adding MouseAdapter to the frame
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }

            public void mouseReleased(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int diff = num1 - num2;
                    resultLabel.setText("Difference: " + diff);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        // Frame settings
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
