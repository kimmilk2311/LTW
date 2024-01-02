package Model;

public class LichHoc {
    private String idLH;
    private String idMon;
    private String Lop;
    private String idGV;
    private String idPhong;
    private int Thu;
    private int tietBD;
    private int tongtiet;
	public LichHoc() {
		super();
	}
	public String getIdLH() {
		return idLH;
	}
	public void setIdLH(String idLH) {
		this.idLH = idLH;
	}
	public String getIdMon() {
		return idMon;
	}
	public void setIdMon(String idMon) {
		this.idMon = idMon;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public String getIdGV() {
		return idGV;
	}
	public void setIdGV(String idGV) {
		this.idGV = idGV;
	}
	public String getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}
	public int getThu() {
		return Thu;
	}
	public void setThu(int thu) {
		Thu = thu;
	}
	public int getTietBD() {
		return tietBD;
	}
	public void setTietBD(int tietBD) {
		this.tietBD = tietBD;
	}
	public int getTongtiet() {
		return tongtiet;
	}
	public void setTongtiet(int tongtiet) {
		this.tongtiet = tongtiet;
	}
	public LichHoc(String idLH, String idMon, String lop, String idGV, String idPhong, int thu, int tietBD,
			int tongtiet) {
		super();
		this.idLH = idLH;
		this.idMon = idMon;
		Lop = lop;
		this.idGV = idGV;
		this.idPhong = idPhong;
		Thu = thu;
		this.tietBD = tietBD;
		this.tongtiet = tongtiet;
	}
	
}
