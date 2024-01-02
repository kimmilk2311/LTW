package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.GiaoVien;
import Model.LopHoc;


public class LopHocDAO implements DaoInterface<LopHoc> {
	
	public static LopHocDAO getInstance() {
		return new LopHocDAO();
	}

	@Override
	public int Insert(LopHoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(LopHoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(LopHoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<LopHoc> selectAll() {
		ArrayList<LopHoc> ketqua = new ArrayList<LopHoc>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM LopHoc";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				LopHoc lophoc = new LopHoc();
				lophoc.setIdLop(rs.getString("IdLop"));
				lophoc.setTenLop(rs.getString("TenLop"));
				ketqua.add(lophoc);
			}
			System.out.println("Ban da thuc thi:" + sql);
			System.out.println("Co " + ketqua.size() + " dong bi thay doi! ");
			JDBCUtil.closeConnection(con);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public LopHoc SelectByid(LopHoc t) {
		LopHoc ketqua = null ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM LopHoc where IdLop = ? ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdLop());
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            LopHoc lop = new LopHoc();
	            lop.setIdLop(rs.getString("IdLop"));
	            lop.setTenLop(rs.getString("TenLop"));
	            ketqua = lop;
	        }
			System.out.println("Ban da thuc thi:" + sql);
			if (ketqua != null) {
	            System.out.println("Đa tim thay mon : IdLop = " + ketqua.getIdLop() + ", TenMon = " + ketqua.getTenLop());
	        } else {
	            System.out.println("Khong tim thay voi IdLop = " + t.getIdLop());
	        }
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<LopHoc> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
   
}
