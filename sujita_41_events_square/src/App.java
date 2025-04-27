import java.awt.event.*;
import javax.swing.*;

public class App implements ActionListener 
{
    JTextField inputField;
    JTextField outputField;
    JButton b;

    App() {
        JFrame f = new JFrame("Square Calculator");

        inputField = new JTextField();
        inputField.setBounds(50, 30, 200, 30);

        outputField = new JTextField();
        outputField.setBounds(50, 70, 200, 30);
        

        b = new JButton("Calculate square");
        b.setBounds(50, 110, 200, 30);

        b.addActionListener(this);

        f.add(inputField);
        f.add(outputField);
        f.add(b);

        f.setSize(320, 220); // Set frame size
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            int square = number * number;
            outputField.setText(String.valueOf(square));
        } catch (NumberFormatException ex) {
            outputField.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
