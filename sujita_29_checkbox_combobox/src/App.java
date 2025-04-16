import javax.swing.*;
public class App {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JCheckBox checkBox1=new JCheckBox("Java");
        JCheckBox checkBox2=new JCheckBox("C");

        checkBox1.setBounds(70,100,500,50);
        checkBox2.setBounds(70,140,500,50);
        
        String courses[]={"beginner","novice","intermediate","Advance"};
        JComboBox c=new JComboBox (courses);
        c.setBounds(40,40,90,20);

        f.add(c);
        f.add(checkBox2);
        f.add(checkBox1);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);

    }
}