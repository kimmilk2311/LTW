package Model;

public class Phong {
    private String idPhong;
    private String tenPhong;
	public Phong() {
		super();
	}
	public Phong(String idPhong, String tenPhong) {
		super();
		this.idPhong = idPhong;
		this.tenPhong = tenPhong;
	}
	public String getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
    
}
