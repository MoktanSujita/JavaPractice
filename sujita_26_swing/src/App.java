import javax.swing.*;
public class App {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton b=new JButton("Okay");
        b.setBounds(100,120,100,40);
        f.add(b);
        f.setSize(100,200);
        f.setVisible(true);
        f.setLayout(null);
    }
}