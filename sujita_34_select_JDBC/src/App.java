import java.sql.*;

public class App {

    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSl=false","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select id,name,address FROM student WHERE age=25");
            while (rs.next()) 
            {
                System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getString(3));
                con.close();
                
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}