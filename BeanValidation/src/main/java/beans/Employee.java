package beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private int eage;
	private String eemail;
	private String emobile;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public String getEmobile() {
		return emobile;
	}

	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}

	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee Id     : " + eid);
		System.out.println("Employee Name   : " + ename);
		System.out.println("Employee Salary : " + esal);
		System.out.println("Employee Email  : " + eemail);
		System.out.println("Employee Mobile : " + emobile);
	}
}
