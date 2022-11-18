import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected DB successfully!");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + "-" + name + "-" + age);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
