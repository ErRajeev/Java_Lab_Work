import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// Initialize PrintWriter pw
		PrintWriter pw = response.getWriter();

		String rno = request.getParameter("rno");
		String name = request.getParameter("name");
		int m1 = Integer.parseInt(request.getParameter("math"));
		int m2 = Integer.parseInt(request.getParameter("phy"));
		int m3 = Integer.parseInt(request.getParameter("che"));
		int m4 = Integer.parseInt(request.getParameter("hindi"));
		int m5 = Integer.parseInt(request.getParameter("eng"));
		int total = m1 + m2 + m3 + m4 + m5;
		float avg = (float) total / 5;
		String result;
		String grade;
		pw.println("<center><h1 style:{color:red}>");
		pw.println("Marks are registered Successfully!");
		if (avg < 50) {
			result = "FAIL";
			grade = "F";
		} else {
			result = "PASS";
			if (avg >= 50 && avg <= 59)
				grade = "E";
			else if (avg >= 60 && avg <= 69)
				grade = "D";
			else if (avg >= 70 && avg <= 79)
				grade = "C";
			else if (avg >= 80 && avg <= 89)
				grade = "B";
			else if (avg >= 90 && avg <= 94)
				grade = "A";
			else
				grade = "O";
		}
		if (result == "PASS") {
			pw.println("<center><h1 style:{color:red}>");

			pw.println("Result of the Student <br> <br> '" + name + "' is " + result + " with grade " + grade);
		} else {
			pw.println("<center><h1 style:{color:red}>");

			pw.println("Better Luck For Next Time <br> <br> '" + name + "' is " + result + " with grade " + grade);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33070/tutorial", "root", "R@jeevoo7");
			String sql = "INSERT INTO result VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rno);
			ps.setString(2, name);
			ps.setInt(3, m1);
			ps.setInt(4, m2);
			ps.setInt(5, m3);
			ps.setInt(6, m4);
			ps.setInt(7, m5);
			ps.setInt(8, total);
			ps.setFloat(9, avg);
			ps.setString(10, result);
			ps.setString(11, grade);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}
}
