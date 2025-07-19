package beans;

public class Employee {

	private String eId;
	private String eName;
	private float eSal;
	private String eAddr;
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

	public String geteAddr() {
		return eAddr;
	}

	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public void displayEmpDetail() {
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee Id :" + eId);
		System.out.println("Employee Name :" + eName);
		System.out.println("Employee Salary :" + eSal);
		System.out.println("Employee Address:" + eAddr);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("---------------------");
		System.out.println("Account Number :" + acc.getAccNo());
		System.out.println("Account Name :" + acc.getAccName());
		System.out.println("Account Type :" + acc.getAccType());
		System.out.println("Account Balance :" + acc.getBalance());
	}

}
