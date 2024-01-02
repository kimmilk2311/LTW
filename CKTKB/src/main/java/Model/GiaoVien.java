package Model;

public class GiaoVien {
    private String idGV;
    private String tenGV;
	public GiaoVien() {
		super();
	}
	public GiaoVien(String idGV, String tenGV) {
		super();
		this.idGV = idGV;
		this.tenGV = tenGV;
	}
	public String getIdGV() {
		return idGV;
	}
	public void setIdGV(String idGV) {
		this.idGV = idGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	@Override
	public String toString() {
		return "GiaoVien [idGV=" + idGV + ", tenGV=" + tenGV + "]";
	}
    
}
