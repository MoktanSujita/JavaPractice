import java.sql.*;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        String inputUsername=sc.nextLine();
        System.out.println("Enter password: ");
        String inputPassword=sc.nextLine();
        
        sc.close();
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb?useSSL=false","root","");
        
              String loginSQL="SELECT * FROM users WHERE username=? AND password=?";
              PreparedStatement stmt=conn.prepareStatement(loginSQL);
              stmt.setString(1, inputUsername);
              stmt.setString(2, inputPassword);
              ResultSet loginResult=stmt.executeQuery();
              if(loginResult.next())
              {
                  System.out.println("Login Successful," +inputUsername);
              }
              else
              {
                  System.out.println("Invalid password or username");
              }
              conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}