package beans;

public class Course {
	private String cid;
	private String cname;
	private int ccost;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCcost() {
		return ccost;
	}

	public void setCcost(int ccost) {
		this.ccost = ccost;
	}

	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("-----------------");
		System.out.println("Course Id :" + cid);
		System.out.println("Course Name :" + cname);
		System.out.println("Course Cost :" + ccost);
	}
}
