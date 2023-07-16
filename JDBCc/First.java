import java.sql.*;

class JavaConnect {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
                    "R@jeevoo7");// Establishing connection
            System.out.println("Connected With the database successfully");

        } catch (SQLException e) {

            System.out.println("Error while connecting to the database");

        }
    }
}