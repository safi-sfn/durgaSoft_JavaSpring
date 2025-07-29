package beans;

// Simple POJO class 
public class Course {
	
	private String cId;
	private String cName;
	private int cCost;
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcCost() {
		return cCost;
	}
	public void setcCost(int cCost) {
		this.cCost = cCost;
	}
	
}
