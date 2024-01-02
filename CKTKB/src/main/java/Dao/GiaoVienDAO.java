package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.GiaoVien;

public class GiaoVienDAO implements DaoInterface<GiaoVien> {
	
	public static GiaoVienDAO getInstance() {
		return new GiaoVienDAO();
	}

	@Override
	public int Insert(GiaoVien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(GiaoVien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(GiaoVien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<GiaoVien> selectAll() {
		ArrayList<GiaoVien> ketqua = new ArrayList<GiaoVien>() ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM GiaoVien";             
			PreparedStatement  pst = con.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            GiaoVien giaovien = new GiaoVien();
	            giaovien.setIdGV(rs.getString("IdGV"));
	            giaovien.setTenGV(rs.getString("TenGV"));
	            ketqua.add(giaovien);
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
	public GiaoVien SelectByid(GiaoVien t) {
		GiaoVien ketqua = null ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Giaovien where IdGV = ? ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdGV());
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            GiaoVien giaovien = new GiaoVien();
	            giaovien.setIdGV(rs.getString("IdGV"));
	            giaovien.setTenGV(rs.getString("TenGV"));
	            ketqua = giaovien;
	        }
			System.out.println("Ban da thuc thi:" + sql);
			if (ketqua != null) {
				System.out.println("Đa tim thay mon : IdMon = " + ketqua.getIdGV() + ", TenMon = " + ketqua.getIdGV());
	        } else {
	            System.out.println("Khong tim thay voi IdMon = " + t.getIdGV());
	        }
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<GiaoVien> selectByCondition(String condition) {
		ArrayList<GiaoVien> ketqua = new ArrayList<GiaoVien>() ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM GiaoVien where " + condition ;             
			PreparedStatement  pst = con.prepareStatement(sql);

	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            GiaoVien giaovien = new GiaoVien();
	            giaovien.setIdGV("IdGV");
	            giaovien.setTenGV(rs.getString("TenGV") );
	            ketqua.add(giaovien);
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
	
	public ArrayList<GiaoVien> selectByMonId(String monId) {
	    ArrayList<GiaoVien> ketqua = new ArrayList<>();
	    String sql = "SELECT GiaoVien.* FROM GiaoVien JOIN LichHoc ON GiaoVien.IdGV = LichHoc.IdGV WHERE LichHoc.IdMon = ?";

	    try (Connection con = JDBCUtil.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {

	        // Thiết lập giá trị cho tham số IdMon
	        pst.setString(1, monId);

	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                GiaoVien giaovien = new GiaoVien();
	                giaovien.setIdGV(rs.getString("IdGV"));
	                giaovien.setTenGV(rs.getString("TenGV"));
	                ketqua.add(giaovien);
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
	
	public ArrayList<GiaoVien> selectByLopId(String lopId) {
	    ArrayList<GiaoVien> ketqua = new ArrayList<>();
	    String sql = "SELECT GiaoVien.* FROM GiaoVien JOIN LichHoc ON GiaoVien.IdGV = LichHoc.IdGV WHERE LichHoc.IdLop = ?";

	    try (Connection con = JDBCUtil.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {

	        // Thiết lập giá trị cho tham số IdLop
	        pst.setString(1, lopId);

	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                GiaoVien giaovien = new GiaoVien();
	                giaovien.setIdGV(rs.getString("IdGV"));
	                giaovien.setTenGV(rs.getString("TenGV"));
	                ketqua.add(giaovien);
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

}
