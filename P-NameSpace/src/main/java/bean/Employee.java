package bean;

public class Employee {
	private String eId;
	private String eName;
	private float eSal;
	private String addr;
	private Account acc;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", addr=" + addr + ", acc=" + acc + "]";
	}
	
	
}
