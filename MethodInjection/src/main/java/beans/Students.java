package beans;

public class Students {
	private String sId;
	private String sName;
	private String sAddr;
	private Course course;
	
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
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
//	@Override
//	public String toString() {
//		return "Students [sId=" + sId + ", sName=" + sName + ", sAddr=" + sAddr + ", course=" + course + "]";
//	}
//	
	public void showStudent() {
		System.out.println();
		System.out.println("Student details");
		System.out.println("---------------------");
		System.out.println("Student ID      : "+sId);
		System.out.println("Student Name    : "+sName);
		System.out.println("Student Address : "+sAddr);
		System.out.println();
		System.out.println("Course Details");
		System.out.println("----------------------");
		System.out.println("Course ID     : "+course.getcId());
		System.out.println("Course Name   : "+course.getcName());
		System.out.println("Course Cost   : "+course.getcCost());
		
	}
	
}
