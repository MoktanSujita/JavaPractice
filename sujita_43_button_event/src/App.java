import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {

    JTextField txt1, txt2, txt3;
    JLabel lbl1, lbl2;
    JButton b;

    App() {
        JFrame f = new JFrame("Sum Calculator");

        lbl1 = new JLabel("First num:");
        lbl1.setBounds(20, 20, 100, 20);

        txt1 = new JTextField();
        txt1.setBounds(120, 20, 100, 20);

        lbl2 = new JLabel("Second num:");
        lbl2.setBounds(20, 50, 100, 20);

        txt2 = new JTextField();
        txt2.setBounds(120, 50, 100, 20);

        b = new JButton("Sum");
        b.setBounds(80, 80, 80, 30);
        b.addActionListener(this);

        txt3 = new JTextField();  // To show result
        txt3.setBounds(80, 120, 100, 20);
        txt3.setEditable(false);  // Optional: makes it read-only

        f.add(lbl1);
        f.add(txt1);
        f.add(lbl2);
        f.add(txt2);
        f.add(b);
        f.add(txt3);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(txt1.getText());
        int n2 = Integer.parseInt(txt2.getText());
        int result = n1 + n2;
        txt3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new App();
    }
}
