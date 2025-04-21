import java.awt.event.*;
import javax.swing.*;
public class App implements MouseListener {

    JLabel lbloutput;
    JTextField txtOne;
    JTextField txtTwo;
    App()
    {
        JFrame f=new JFrame();
        txtOne=new JTextField();
        txtOne.setBounds(50,50,100,20);

        txtTwo=new JTextField();
        txtTwo.setBounds(50,80,100,20);

        lbloutput=new JLabel();
        lbloutput.setBounds(50,110,100,20);

        lbloutput.addMouseListener(this);
        f.add(txtOne);
        f.add(txtTwo);
        f.add(lbloutput);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);
    }
       public void mousePressed(MouseEvent e)
        {
            int a=Integer.parseInt(txtOne.getText());
            int b=Integer.parseInt(txtTwo.getText());

            int c=a+b;

            lbloutput.setText(String.valueOf(c));
        }

        public void mouseReleased(MouseEvent e)
        {
            int a=Integer.parseInt(txtOne.getText());
            int b=Integer.parseInt(txtTwo.getText());

            int c=a-b;

            lbloutput.setText(String.valueOf(c));
        }
        public void mouseClicked(MouseEvent e)
        {

        }
        public void mouseEntered(MouseEvent e)
        {

        }
        public void mouseExited(MouseEvent e)
        {

        }
        public static void main(String[] args) {
            new App();
        }
    }
    