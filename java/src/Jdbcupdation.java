import java.sql.*;

public class Jdbcupdation {
    public static void main(String[] args) {
        System.out.println("Hello, JDBC!");
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");

            // String ins = "insert into students values(?, ?, ?)";
            // PreparedStatement ps = conn.prepareStatement(ins);
            // ps.setInt(1, 9);
            // ps.setString(2, "John");
            // ps.setInt(3, 70);
            // ps.executeUpdate();
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Marks: "
                                + rs.getInt("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}