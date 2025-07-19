package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean  {
	
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Initializing 'name' through setName() Method");
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Initializing 'message' through setMessage() Method");
		this.message = message;
	}
	/*
	public void init() {
		System.out.println("Initializing 'name' and 'message' through init() Method");
		name = "Anil";
		message = "Good Evening";
	}
	
	public void destroy() {
		System.out.println("destriy()-Method");
		name = "";
		message ="";
	}
	*/

/*
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initializing through afterPropertiesSet() Method");
		name="Ramesh";
		message="Good morning";
	}
	public String sayHello() {
		return "Hello "+name+", "+message;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method");
		
	}
*/  
	@PostConstruct
	public void initializeBean() {
		System.out.println("Initialization through PostConstruct annotation");
		name="Rahul";
		message="Good Morning";
	}
	
	public String sayHello() {
		return "Hello "+name+", "+message;
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("Bean Deinstantiation through PostDestroy annotation");
	}
	

	
}
