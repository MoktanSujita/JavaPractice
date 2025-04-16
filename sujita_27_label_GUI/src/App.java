import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame f=new JFrame();
        JLabel lbl=new JLabel("Hello");
        lbl.setBounds(40,40,90,20);
        f.add(lbl);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}