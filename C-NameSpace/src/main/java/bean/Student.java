package bean;

public class Student {
	private String sId;
	private String sName;
	private String sAddr;
	private Course course;
	public Student(String sId, String sName, String sAddr, Course course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddr = sAddr;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddr=" + sAddr + ", course=" + course + "]";
	}
	
	
}
