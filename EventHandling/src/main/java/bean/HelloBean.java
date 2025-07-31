package bean;

public class HelloBean {
	
	private String uname;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String wish(){
		return "Hello "+uname+"!";
    }
}
