import java.sql.*;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=JDBC;username=sa;password=123456789";
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url);
            System.out.println("Connected DB successfully!");
            // System.out.println(connection);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("username");
                int age = rs.getInt("age");
                System.out.println(id + "-" + name + "-" + age);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
