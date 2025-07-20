package bean;

public class Employee {
	private String eId;
	private String eName;
	private float eSal;
	private String eAddr;

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

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public void getEmpDetail() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee ID      : " + eId);
		System.out.println("Employee Name    : " + eName);
		System.out.println("Employee Salary  : " + eSal);
		System.out.println("Employee Address : " + eAddr);
	}

}
