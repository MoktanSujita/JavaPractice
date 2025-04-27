import java.sql.*;

public class App {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false","root","");
            String sql="DELETE fROM student WHERE id=? ";
            PreparedStatement stmt= con.prepareStatement(sql);
            stmt.setInt(1,6);

            stmt.executeUpdate();
            con.close();
            System.out.println("Data Deleted");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false","root","");
            String selectsql="SELECT * FROM student";
            PreparedStatement ps=conn.prepareStatement(selectsql);
            ResultSet rs=ps.executeQuery(selectsql);
            while (rs.next()) 
            {
               System.out.println(rs.getInt(1)+" " +rs.getString(2)+" " +rs.getString(3)+" "+rs.getInt(4));
               
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}