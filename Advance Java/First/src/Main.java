import java.sql.*;

class First{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shopping";
        String user = "root";
        String password = "R@jeevoo7";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully");
            ReadData(con);
            UpdateData(con);
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
    public static void ReadData(Connection con){
        String sql = "select * from customer";
        try(Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql))
        {
            while (rs.next()){
                int id = rs.getInt("c_id");
                String name = rs.getString("c_name");
                String email = rs.getString("c_email");
                System.out.println("ID: " + id + ", Name: " + name + "Email: " + email  );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public  static  void UpdateData(Connection con){
        String str = "update from customer set name = ? where id = ?";


    }
}