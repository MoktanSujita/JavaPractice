import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App extends Frame implements ActionListener {

    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b;
    JComboBox<String> c;

    App()
    {
        t1=new JTextField();
        t1.setBounds(120, 100, 100, 20);

        t2=new JTextField();
        t2.setBounds(120, 140, 100, 20);

        t3=new JTextField();
        t3.setBounds(120,210,100,20);

        l1=new JLabel("First Number:");
        l1.setBounds(20, 100, 100, 20);

        l2=new JLabel("Second Number:");
        l2.setBounds(20, 140, 100, 20);

        l3=new JLabel("Select Option:");
        l3.setBounds(20, 170, 100, 20);

        String[] s=new String[] {"Add","Subtract","Multiply","Divide"};
        c=new JComboBox<String>(s);
        c.setBounds(120, 170, 100, 20);

        b=new JButton("Calculate");
        b.setBounds(20,200,90,20);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        add(c);

        b.addActionListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            if(c.getSelectedItem()=="Add")
            {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int result=n1+n2;
                t3.setText(String.valueOf(result));
            }
            else if(c.getSelectedItem()=="Subtract")
            {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int result=n1-n2;
                t3.setText(String.valueOf(result));
            }
            else if(c.getSelectedItem()=="Multiply")
            {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int result=n1*n2;
                t3.setText(String.valueOf(result));
            }
            else
            {
                int n1=Integer.parseInt(t1.getText());
                int n2=Integer.parseInt(t2.getText());
                int result=n1/n2;
                t3.setText(String.valueOf(result));
            }
            
        }
    }

    public static void main(String[] args) {
        new App();
    }

}