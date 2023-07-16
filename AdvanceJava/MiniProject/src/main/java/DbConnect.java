import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	private String dburl = "jdbc:mysql://localhost:3306/miniproject";
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

	public String insert(Form form) {
		loadDriver(dbdriver);
		String sql = "insert into form values(?,?,?,?,?,?,?)";
		String result = "Data Entered Successfully";
		try {
			Connection con = getConnection();
			if (con == null) {
				result = "Failed to establish a database connection";
			} else {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, form.getName());
				ps.setString(2, form.getRno());
				ps.setInt(3, form.getMath());
				ps.setInt(4, form.getJava());
				ps.setInt(5, form.getDbms());
				ps.setInt(6, form.getPython());
				ps.setInt(7, form.getDcn());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			result = "An error occurred during data insertion: " + e.getMessage();
			e.printStackTrace();
		}
		return result;
	}

	public void process(String rno) {
		loadDriver(dbdriver);
		String sql = "select math, java, dbms, python, dcn from form where rno = '?'";
		String result = "Data Entered Successfully";
		try {
			Connection con = getConnection();
			if (con == null)
				result = "Failed to establish a database connection";
			else {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(0, rno);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next())
					System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4)
							+ "  " + rs.getInt(5));
				con.close();
			}
		} catch (SQLException e) {
			result = "An error occurred during data insertion: " + e.getMessage();
			e.printStackTrace();
		}
	}
}