package launchApp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloBean;

public class LaunchMainApp {

	public static void main(String[] args)throws Exception {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean hello=(HelloBean)context.getBean("helloBean");
		System.out.println(hello.wish());
		context.start();
		context.refresh();
		context.stop();
		context.close();

	}

}
