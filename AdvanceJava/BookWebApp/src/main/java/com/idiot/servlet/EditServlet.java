package com.idiot.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.NullPointerException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editurl")
public class EditServlet extends HttpServlet {
//	private static final String query = "update BOOKDATA set BOOKNAME=?,BOOKEDITION=?,BOOKPRICE=? where id=?";
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		PrintWriter pw = res.getWriter();
//		res.setContentType("text/html");
//		int id = Integer.parseInt(req.getParameter("id"));
//		String bookName = req.getParameter("bookName");
//		String bookEdition = req.getParameter("bookEdition");
//		float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException cnf) {
//			cnf.printStackTrace();
//		}
//		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "Pooja");
//				PreparedStatement ps = con.prepareStatement(query);) {
//			ps.setInt(1, id);
//			ps.setString(2, bookName);
//			ps.setString(3, bookEdition);
//			ps.setFloat(4, bookPrice);
//			int count = ps.executeUpdate();
//			if (count == 1) {
//				pw.println("<h2>Record is Edited Successfull</h2>");
//			} else {
//				pw.println("<h2>Record is not Edited Successfull</h2>");
//			}
//		} catch (SQLException se) {
//			se.printStackTrace();
//			pw.println("<h1>" + se.getMessage() + "</h2>");
//		} catch (Exception e) {
//			e.printStackTrace();
//			pw.println("<h1>" + e.getMessage() + "</h2>");
//		}
//		pw.println("<a href='home.html'>Home</a>");
//		pw.println("<br>");
//		pw.println("<a href='bookList'>Book List</a>");
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		doGet(req, res);
//	}
//
//}















private static final String query = "update BOOKDATA set BOOKNAME=?,BOOKEDITION=?,BOOKPRICE=? where id=?";
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    PrintWriter pw = res.getWriter();
    res.setContentType("text/html");
    
    String idParam = req.getParameter("id");
    String bookName = req.getParameter("bookName");
    String bookEdition = req.getParameter("bookEdition");
    String bookPriceParam = req.getParameter("bookPrice");
    
    if (idParam == null || bookName == null || bookEdition == null || bookPriceParam == null) {
        pw.println("<h2>Invalid request parameters</h2>");
        pw.println("<a href='home.html'>Home</a>");
        return;
    }
    
    int id;
    float bookPrice;
    try {
        id = Integer.parseInt(idParam);
        bookPrice = Float.parseFloat(bookPriceParam);
    } catch (NumberFormatException e) {
        pw.println("<h2>Invalid number format</h2>");
        pw.println("<a href='home.html'>Home</a>");
        return;
    }
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException cnf) {
        cnf.printStackTrace();
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "Pooja");
            PreparedStatement ps = con.prepareStatement(query);) {
        ps.setInt(1, id);
        ps.setString(2, bookName);
        ps.setString(3, bookEdition);
        ps.setFloat(4, bookPrice);
        int count = ps.executeUpdate();
        if (count == 1) {
            pw.println("<h2>Record is Edited Successfully</h2>");
        } else {
            pw.println("<h2>Record is not Edited Successfully</h2>");
        }
    } catch (SQLException se) {
        se.printStackTrace();
        pw.println("<h1>" + se.getMessage() + "</h2>");
    } catch (Exception e) {
        e.printStackTrace();
        pw.println("<h1>" + e.getMessage() + "</h2>");
    }
    
    pw.println("<a href='home.html'>Home</a>");
    pw.println("<br>");
    pw.println("<a href='bookList'>Book List</a>");
}

}