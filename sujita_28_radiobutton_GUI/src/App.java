import javax.swing.*;
public class App {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JRadioButton r1=new JRadioButton("A)Male",true);
        JRadioButton r2=new JRadioButton("B)Female");
        JRadioButton r3=new JRadioButton("C)Others");
        r1.setBounds(75,50,100,25);
        r2.setBounds(75,100,100,25);
        r3.setBounds(75,150,100,25);

        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}