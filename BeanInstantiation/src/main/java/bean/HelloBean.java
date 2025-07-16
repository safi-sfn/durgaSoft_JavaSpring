package bean;

public class HelloBean {
	
	
	//By using Constructor 
	public HelloBean() // Constructor will be executed at the time of object creation 
	{
		System.out.println("HelloBean Instantiation");
	}
	
	static // static block will executed at the time of HelloBean class loading
	{  
		System.out.println("HelloBean class loading");
	}
	
	public String sayHello() {
		return "Hello user!";
	}
	
	// By using static factory method
//	public static HelloBean getInstance() {
//		System.out.println("in static factory method");
//		return new HelloBean();
//	}
}
