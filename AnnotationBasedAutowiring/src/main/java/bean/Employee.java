package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Employee {
	private String eId;
	private String eName;
	private float eSal;
	
	@Autowired()
	@Qualifier("savingAcc")
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
	public Account getAcc() {
		return acc;
	}
	

//	@Autowired()
//	@Qualifier("savingAcc")
//	@Qualifier("currentAcc")
	public void setAcc(Account acc) {
		this.acc = acc;
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
		System.out.println("Employee AccountID     : "+acc.getAccNo());
		System.out.println("Employee Account Name  : "+acc.getAccName());
		System.out.println("Employee Account Type  : "+acc.getAccType());
		System.out.println();
	}
	
}
