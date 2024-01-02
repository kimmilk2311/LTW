package Test;

import java.util.ArrayList;

import Dao.GiaoVienDAO;
import Dao.LopHocDAO;
import Dao.MonDAO;
import Model.GiaoVien;
import Model.LichHoc;
import Model.LopHoc;
import Model.Mon;

public class TestMonDAO {
    public static void main(String[] args) {
    	/* Test insert */
	/*     Mon mon1 = new Mon("M03", "He Dieu Hanh");
		MonDAO.getInstance().Insert(mon1);  */
		/* Test update */
    /*	Mon mon1 = new Mon("M01", "He Quan Tri" );
    	MonDAO.getInstance().Update(mon1); */
    	
    /*  Mon mon2 = new Mon("M03", null);
       MonDAO.getInstance().Delete(mon2);  */
    	
    	 /*     ArrayList<Mon> list = MonDAO.getInstance().selectAll();
     for (Mon mon : list) {
    	 System.out.println(mon.toString());  */
     
    /*    System.out.println("--------------------");
     Mon find = new Mon();
     find.setIdMon("M02");
     Mon mon2 = MonDAO.getInstance().SelectByid(find);   
     System.out.println(mon2); */
     
     ArrayList<GiaoVien> list2 = GiaoVienDAO.getInstance().selectByCondition("IdGV in (select IdGV from LichHoc where IdMon='M01')");
     for (GiaoVien giaovien : list2) {
    	 System.out.println(giaovien.toString());
     }
     System.out.println("--------------------");
     ArrayList<LopHoc> list3 = LopHocDAO.getInstance().selectAll();
     for (LopHoc lh : list3) {
    	 System.out.println(lh.toString());
     }
    
     
    }
    
    
 
}
