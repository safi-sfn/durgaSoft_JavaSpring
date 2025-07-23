package bean;

public class Employee {
	private String eId;
	private String eName;
	private float eSal;
	private Account acc;
	private Address addr;
	
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
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void showEmpDetails() {
		System.out.println("Employee detail");
		System.out.println("---------------------");
		System.out.println("Employee ID      : "+eId);
		System.out.println("Employee Name    : "+eName);
		System.out.println("Employee Salary  : "+eSal);
		System.out.println();
		System.out.println("Employee Account detail");
		System.out.println("---------------------");
		System.out.println("Employee AccountID     : "+acc.getAccId());
		System.out.println("Employee Account Name  : "+acc.getAccName());
		System.out.println("Employee Account Type  : "+acc.getAccType());
		System.out.println();
		System.out.println("Employee Address detail");
		System.out.println("---------------------");
		System.out.println("Employee PIN    : "+addr.getPin());
		System.out.println("Employee State  : "+addr.getState());
		System.out.println("Employee City   : "+addr.getCity());
	}
	
}
