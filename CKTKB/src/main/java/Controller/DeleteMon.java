package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import Dao.MonDAO;
import Database.JDBCUtil;
import Model.Mon;

/**
 * Servlet implementation class DeleteMon
 */
@WebServlet("/deletemon")
public class DeleteMon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String idm = request.getParameter("idm");
		 MonDAO dao = new MonDAO();
		 Mon montodelete = new Mon();
		 montodelete.setIdMon(idm);
		 int result = dao.Delete(montodelete);
		 request.setAttribute("result", result);
		 response.sendRedirect("mon");	    
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
