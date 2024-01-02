package Model;

public class Mon {
   private String idMon;
   private String tenMon;
   
   public Mon() {
	super();
   }

   public Mon(String idMon, String tenMon) {
	super();
	this.idMon = idMon;
	this.tenMon = tenMon;
   }

  public String getIdMon() {
	return idMon;
  }

  public void setIdMon(String idMon) {
	this.idMon = idMon;
  }

  public String getTenMon() {
	return tenMon;
  }

  public void setTenMon(String tenMon) {
	this.tenMon = tenMon;
  }

  @Override
  public String toString() {
	return "Mon [idMon=" + idMon + ", tenMon=" + tenMon + "]";
  }
   
  
   
}
