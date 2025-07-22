package bean;

public class Course {
	private String cId;
	private String cName;
	private Integer cCost;
	
	public Course(String cId, String cName, Integer cCost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCost = cCost;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cCost=" + cCost + "]";
	}
	
	
}
