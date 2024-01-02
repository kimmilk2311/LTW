package Model;

public class LopHoc {
    private String idLop;
    private String tenLop;
	public LopHoc() {
		super();
	}
	public LopHoc(String idLop, String tenLop) {
		super();
		this.idLop = idLop;
		this.tenLop = tenLop;
	}
	public String getIdLop() {
		return idLop;
	}
	public void setIdLop(String idLop) {
		this.idLop = idLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	@Override
	public String toString() {
		return "LopHoc [idLop=" + idLop + ", tenLop=" + tenLop + "]";
	}
	
}
