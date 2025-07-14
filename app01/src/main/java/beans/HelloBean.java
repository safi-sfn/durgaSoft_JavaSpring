package beans;

public class HelloBean {
	
	private String name;
	
	static {
		System.out.println("HelloBean class Loading....");
	}
	public HelloBean() {
		System.out.println("HelloBean class Instantiation...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello () {
		return "Say hello! to "+name;
	}
}
