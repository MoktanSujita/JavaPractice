import javax.swing.*;
public class App {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");

        // Name
        JLabel l = new JLabel("Name:");
        l.setBounds(50, 50, 100, 30);
        f.add(l);

        JTextField name = new JTextField();
        name.setBounds(150, 50, 200, 30);
        f.add(name);

        // Address
        JLabel a = new JLabel("Address:");
        a.setBounds(50, 100, 100, 30);
        f.add(a);

        JTextArea address = new JTextArea();
        address.setBounds(150, 100, 200, 60);
        f.add(address);

        // Email
        JLabel e = new JLabel("Email:");
        e.setBounds(50, 180, 100, 30);
        f.add(e);

        JTextField email = new JTextField();
        email.setBounds(150, 180, 200, 30);
        f.add(email);

        // Gender
        JLabel g = new JLabel("Gender:");
        g.setBounds(50, 230, 100, 30);
        f.add(g);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 230, 80, 30);
        f.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(230, 230, 100, 30);
        f.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Country
        JLabel country = new JLabel("Country:");
        country.setBounds(50, 280, 100, 30);
        f.add(country);

        String[] countries = {"Korea", "Japan", "USA", "Nepal"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(150, 280, 200, 30);
        f.add(countryComboBox);

        // Hobbies
        JLabel h = new JLabel("Hobbies:");
        h.setBounds(50, 330, 100, 30);
        f.add(h);

        JCheckBox Reading = new JCheckBox("Reading");
        Reading.setBounds(150, 330, 100, 30);
        f.add(Reading);

        JCheckBox Traveling = new JCheckBox("Traveling");
        Traveling.setBounds(250, 330, 100, 30);
        f.add(Traveling);

        JCheckBox Sports = new JCheckBox("Sports");
        Sports.setBounds(350, 330, 100, 30);
        f.add(Sports);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 400, 100, 30);
        f.add(submitButton);

        // Frame settings
        f.setLayout(null);
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
