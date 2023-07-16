import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
	private String dburl = "jdbc:mysql://localhost:3306/rajeev";
	private String dbuname = "root";
	private String dbpassword = "R@jeevoo7";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Member member) {
		loadDriver(dbdriver);
		String sql = "insert into member values(?,?,?,?)";
		String result = "Data Entered Successfully";
		try {
			Connection con = getConnection();
			if (con == null) {
				result = "Failed to establish a database connection";
			} else {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, member.getUname());
				ps.setString(2, member.getPassword());
				ps.setString(3, member.getEmail());
				ps.setNString(4, member.getPhone());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			result = "An error occurred during data insertion: " + e.getMessage();
			e.printStackTrace();
		}
		return result;
	}
}