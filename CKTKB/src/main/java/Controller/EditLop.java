package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Dao.LichHocDAO;
import Dao.LopHocDAO;
import Dao.MonDAO;
import Model.LichHoc;
import Model.LopHoc;
import Model.Mon;

/**
 * Servlet implementation class EditLop
 */
@WebServlet("/editlop")
public class EditLop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditLop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("idl");
		LopHocDAO dao = new LopHocDAO();
		LopHoc loptoedit = new LopHoc();
		loptoedit.setIdLop(id);
		loptoedit = dao.SelectByid(loptoedit);
		request.setAttribute("data", loptoedit );
		
		MonDAO monDAO = MonDAO.getInstance();
		ArrayList<Mon> list = monDAO.selectByMonLopId(id);
		request.setAttribute("Listmon", list);
		
		request.getRequestDispatcher("Edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 /*		String idMon = request.getParameter("idMon");
        String idGV = request.getParameter("teacherName");
        String idPhong = request.getParameter("room");
        int thu = Integer.parseInt(request.getParameter("day"));
        int tietBD = Integer.parseInt(request.getParameter("startHour"));
        int tongtiet = Integer.parseInt(request.getParameter("totalHours"));

        String idLop = request.getParameter("idl");

 
        if (idLop != null && idMon != null && idGV != null && idPhong != null) {
            try {
                LichHocDAO lichHocDAO = new LichHocDAO();

                boolean updated = lichHocDAO.updateLichHocInfoWithoutIdLH(idLop, idMon, idGV, idPhong, thu, tietBD, tongtiet);

                if (updated) {
                    response.sendRedirect("success.jsp");
                } else {
                    response.sendRedirect("error.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("error.jsp");
            }
        } else {
            response.sendRedirect("error.jsp");
        } */
		    String idLH = request.getParameter("idLH");
	        String idMon = request.getParameter("idMon");
	        String idLop = request.getParameter("idLop");
	        String idGV = request.getParameter("idGV");
	        String idPhong = request.getParameter("idPhong");
	        int thu = Integer.parseInt(request.getParameter("thu"));
	        int tietBD = Integer.parseInt(request.getParameter("tietBD"));
	        int tongTiet = Integer.parseInt(request.getParameter("tongtiet"));

	        LichHoc lichHoc = new LichHoc(idLH, idMon, idLop, idGV, idPhong, thu, tietBD, tongTiet);

	        LichHocDAO lichHocDao = new LichHocDAO();
	        int rowsUpdated = lichHocDao.Update(lichHoc);

	        if (rowsUpdated > 0) {
	            response.sendRedirect("success.jsp");
	            return;
	        } else {
	            response.sendRedirect("error.jsp");
	        }
	    }

}
