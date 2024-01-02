package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Dao.GiaoVienDAO;
import Dao.LichHocDAO;
import Dao.LopHocDAO;
import Dao.MonDAO;
import Model.GiaoVien;
import Model.LopHoc;
import Model.Mon;

/**
 * Servlet implementation class EditMon
 */
@WebServlet("/editmon")
public class EditMon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("ide");
		MonDAO dao = new MonDAO();
		Mon montoedit = new Mon();
		montoedit.setIdMon(id);
		montoedit = dao.SelectByid(montoedit);
		request.setAttribute("data", montoedit );
		
		GiaoVienDAO giaoVienDAO = GiaoVienDAO.getInstance();
		ArrayList<GiaoVien> list = giaoVienDAO.selectByMonId(id);
		request.setAttribute("ListGV", list);
		
		request.getRequestDispatcher("Edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
