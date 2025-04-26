import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("Add Two Numbers");

        JLabel l1 = new JLabel("First number:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        JTextField num1 = new JTextField();
        num1.setBounds(150, 50, 150, 30);
        f.add(num1);

        JLabel l2 = new JLabel("Second number:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        JTextField num2 = new JTextField();
        num2.setBounds(150, 100, 150, 30);
        f.add(num2);

        JLabel l3 = new JLabel("Output:");
        l3.setBounds(50, 150, 100, 30);
        f.add(l3);

        JTextField out = new JTextField();
        out.setBounds(150, 150, 150, 30);
        out.setEditable(false);
        f.add(out);

        JButton button = new JButton("Add");
        button.setBounds(150, 200, 80, 30);
        f.add(button);

        // Correct MouseAdapter on button
        button.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int fnum = Integer.parseInt(num1.getText());
                    int snum = Integer.parseInt(num2.getText());
                    int result = fnum + snum;
                    out.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    out.setText("Invalid Input");
                }
            }
        });

        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
