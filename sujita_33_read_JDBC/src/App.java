import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false", "root", "");

            String sql = "INSERT INTO student(id, name, address, age) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            Object[][] students = {
                {6, "Student F", "Kathmandu", 24},
                {7, "Student G", "Pokhara", 25},
                {8, "Student H", "Lalitpur", 26},
                {9, "Student I", "Bhaktapur", 27},
                {10, "Student J", "Dharan", 28}
            };
            for (Object[] student : students) {
                ps.setInt(1, (int) student[0]);  
                ps.setString(2, (String) student[1]);  
                ps.setString(3, (String) student[2]);  
                ps.setInt(4, (int) student[3]);  

                ps.executeUpdate();  
            }

            System.out.println("All students inserted successfully!");
            ps.close();
            con.close();

            // Calling display method
            App obj = new App();
            obj.DisplayRecord();

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DisplayRecord() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Correct driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4)
                );
            }
            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
