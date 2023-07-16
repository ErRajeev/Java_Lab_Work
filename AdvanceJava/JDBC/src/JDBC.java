import java.sql.*;
import java.util.*;

public class JDBC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rajeev", "root", "R@jeevoo7");
			while (true) {
				System.out.println("1: Insert\n2: update\n3 : Delete\n4: Display");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					insert(con, sc);
					break;
				case 2:
					update(con, sc);
					break;
				case 3:
					delete(con, sc);
					break;
				case 4:
					display(con);
					break;
				default:
					System.out.println("Wrong input");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insert(Connection con, Scanner sc) {
		try {
			System.out.println("Enter student ID:");
			int id = sc.nextInt();
			System.out.println("Enter student name:");
			String name = sc.next();
			String sql = "insert into stu (id, name) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void update(Connection con, Scanner sc) {
		try {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter a Name");
			String name = sc.next();
			String sql = "update stu set name = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delete(Connection con, Scanner sc) {
		try {
			System.out.println("Enter id");
			int id = sc.nextInt();
			String sql = "delete from stu where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void display(Connection con) {
		try {
			String sql = "select * from stu";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
