package launchApp;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import bean.HelloBean;

/*
 * there is two way to initialize bean object
 * 1. through property tag in bean configuration that is through setters method
 * 2. through user define init() 
 */

public class LaunchApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		context.registerShutdownHook(); // for bean destruction method

	}

}
