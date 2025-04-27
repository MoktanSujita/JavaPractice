import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false", "root", "");

            String sql = "SELECT salary FROM employee WHERE salary <= 15000";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            String updatesql = "UPDATE employee SET salary=? WHERE salary=?";
            PreparedStatement ps = con.prepareStatement(updatesql);

            while (rs.next()) {
                int curSalary = rs.getInt("salary");
                int newSalary = (int)(curSalary + (0.15 * curSalary));

                ps.setInt(1, newSalary); // Set new salary first
                ps.setInt(2, curSalary); // WHERE salary = curSalary

                ps.executeUpdate(); // Correct method
            }

            con.close(); // Close after loop
            System.out.println("Updation complete!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
