import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        System.out.println("Hello, JDBC!");
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}