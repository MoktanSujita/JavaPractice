import javax.swing.*;
public class App {
    public static void main(String[] args) {
        JFrame f=new JFrame("JTable");
        String data[][]={ {"101","Student A","Science"},
                           {"102","Student B","Management"},
                        {"103","Student C","Humanities"}};
        String column[]={"Rollno","Name","Department"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        f.add(jt);
        f.setVisible(true);
        f.setSize(400,400);
    }

    
}