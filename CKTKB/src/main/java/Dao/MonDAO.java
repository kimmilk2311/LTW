package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Mon;

public class MonDAO implements DaoInterface<Mon>{
	
	public static MonDAO getInstance() {
		return new MonDAO();
	}

	@Override
	public int Insert(Mon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO MonHoc(IdMon, TenMon) VALUES(?,?) ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdMon());
	        pst.setString(2, t.getTenMon());
	        ketqua = pst.executeUpdate();
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int Update(Mon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.getConnection(); 
			String sql = "UPDATE MonHoc SET TenMon = ? where IdMon = ? ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getTenMon());
	        pst.setString(2, t.getIdMon());
	        ketqua = pst.executeUpdate();
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int Delete(Mon t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM MonHoc WHERE IdMon = ?";             
			PreparedStatement  pst = con.prepareStatement(sql);
	        pst.setString(1, t.getIdMon());
	        ketqua = pst.executeUpdate();
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<Mon> selectAll() {
		ArrayList<Mon> ketqua = new ArrayList<Mon>() ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM MonHoc";             
			PreparedStatement  pst = con.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            Mon mon = new Mon();
	            mon.setIdMon(rs.getString("IdMon"));
	            mon.setTenMon(rs.getString("TenMon"));
	            ketqua.add(mon);
	        }
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua.size() + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public Mon SelectByid(Mon t) {
		Mon ketqua = null ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM MonHoc where IdMon = ? ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdMon());
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            Mon mon = new Mon();
	            mon.setIdMon(rs.getString("IdMon"));
	            mon.setTenMon(rs.getString("TenMon"));
	            ketqua = mon;
	        }
			System.out.println("Ban da thuc thi:" + sql);
			if (ketqua != null) {
	            System.out.println("Đa tim thay mon : IdMon = " + ketqua.getIdMon() + ", TenMon = " + ketqua.getTenMon());
	        } else {
	            System.out.println("Khong tim thay voi IdMon = " + t.getIdMon());
	        }
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}
	public ArrayList<Mon> selectByMonLopId(String monlopId) {
	    ArrayList<Mon> ketqua = new ArrayList<>();
	    String sql = "SELECT MonHoc.* FROM MonHoc JOIN LichHoc ON MonHoc.IdMon = LichHoc.IdMon WHERE LichHoc.IdLop = ?";
	    try (Connection con = JDBCUtil.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {

	        // Thiết lập giá trị cho tham số IdMon
	        pst.setString(1, monlopId);

	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                Mon mon = new Mon();
	                mon.setIdMon(rs.getString("IdMon"));
	                mon.setTenMon(rs.getString("TenMon"));
	                ketqua.add(mon);
	            }
	        }

	        System.out.println("Ban da thuc thi:" + sql);
	        System.out.println("Co " + ketqua.size() + " dong bi thay doi!");

	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Xử lý ngoại lệ, có thể in hoặc log thông điệp lỗi
	    }

	    return ketqua;
	}
	@Override
	public ArrayList<Mon> selectByCondition(String condition) {
		ArrayList<Mon> ketqua = new ArrayList<Mon>() ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM MonHoc where " + condition;             
			PreparedStatement  pst = con.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            Mon mon = new Mon();
	            mon.setIdMon(rs.getString("IdMon"));
	            mon.setTenMon(rs.getString("TenMon"));
	            ketqua.add(mon);
	        }
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua.size() + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}
   
}
