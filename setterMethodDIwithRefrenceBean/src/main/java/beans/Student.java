package beans;

public class Student {
		
	private String sId;
	private String sName;
	private Address sAddr;
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Address getsAddr() {
		return sAddr;
	}
	public void setsAddr(Address sAddr) {
		this.sAddr = sAddr;
	}
	
	public void showStudentDetails() {
		System.out.println("Student Detail");
		System.out.println("--------------------");
		System.out.println("Student ID    : "+sId);
		System.out.println("Student Name  : "+sName);
		System.out.println();
		System.out.println("Student Address");
		System.out.println("--------------------");
		System.out.println("Pin Code  : "+sAddr.getPinCode());
		System.out.println("Street    : "+sAddr.getStreet());
		System.out.println("City      : "+sAddr.getCity());
		System.out.println("State     : "+sAddr.getState());
		System.out.println("Country   : "+sAddr.getCountry());
		
	}
	
	
}
