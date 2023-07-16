import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class MiniProject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MiniProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String rno = request.getParameter("rno");
		int math = Integer.parseInt(request.getParameter("math"));
		int java = Integer.parseInt(request.getParameter("java"));
		int dbms = Integer.parseInt(request.getParameter("dbms"));
		int python = Integer.parseInt(request.getParameter("python"));
		int dcn = Integer.parseInt(request.getParameter("dcn"));
		Form form = new Form(name, rno, math, java, dbms, python, dcn);
		DbConnect dbcon = new DbConnect();
		String res = dbcon.insert(form);
		dbcon.process(rno);
		doGet(request, response);
		response.getWriter().println(res);
	}

}
