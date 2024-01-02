package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.LichHoc;

public class LichHocDAO implements DaoInterface<LichHoc> {
	
	public static LichHocDAO getInstance() {
		return new LichHocDAO();
	}
	
	@Override
	public int Insert(LichHoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(LichHoc t) {
		int ketqua = 0;
		try {
			Connection con = JDBCUtil.getConnection(); 
			String sql = "UPDATE LichHoc SET IdMon = ?, IdLop = ?, IdGV= ?, IdPhong=?, Thu=?, TietBD=?, Tongtiet=? where IdLH = ? ";             
			PreparedStatement  pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdMon());
	        pst.setString(2, t.getLop());
	        pst.setString(3, t.getIdGV());
	        pst.setString(4, t.getIdPhong());
	        pst.setInt(5, t.getThu());
	        pst.setInt(6, t.getTietBD());
	        pst.setInt(7, t.getTongtiet());
	        pst.setString(8, t.getIdLH());
	        
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
	public int Delete(LichHoc t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<LichHoc> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LichHoc SelectByid(LichHoc t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LichHoc> selectByCondition(String condition) {
		ArrayList<LichHoc> ketqua = new ArrayList<LichHoc>() ;
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM LichHoc where " + condition;             
			PreparedStatement  pst = con.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            LichHoc lichhoc = new LichHoc();
	            lichhoc.setIdLH(rs.getString("IdLH"));;
	            lichhoc.setIdMon(rs.getString("IdMon"));
	            lichhoc.setIdGV(rs.getString("IdGV"));
	            lichhoc.setIdPhong(rs.getString("IdPhong"));
	            lichhoc.setThu(rs.getInt("Thu"));
	            lichhoc.setTietBD(rs.getInt("TietBD"));
	            lichhoc.setTongtiet(rs.getInt("TongTiet"));
	            ketqua.add(lichhoc);
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
