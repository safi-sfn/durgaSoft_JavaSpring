package beans;

import java.util.List;
import java.util.Set;

public class Student {
		
	private String sId;
	private String sName;
	private Address sAddr;
	private List<String> sQual;
	private Set<String> sCourses;
	
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
	
	public List<String> getsQual() {
		return sQual;
	}
	public void setsQual(List<String> sQual) {
		this.sQual = sQual;
	}
	
	public Set<String> getsCourses() {
		return sCourses;
	}
	public void setsCourses(Set<String> sCourses) {
		this.sCourses = sCourses;
	}
	
	
	public void showStudentDetails() {
		System.out.println("Student Detail");
		System.out.println("--------------------");
		System.out.println("Student ID             : "+sId);
		System.out.println("Student Name           : "+sName);
		System.out.print("Student Qualification  : ");
		for(String qual:sQual) {
			System.out.print(qual+" ");
		}
		System.out.println();
		System.out.print("Student Courses        : ");
		for(String course:sCourses) {
			System.out.print(course+" ");
		}
		System.out.println();
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
