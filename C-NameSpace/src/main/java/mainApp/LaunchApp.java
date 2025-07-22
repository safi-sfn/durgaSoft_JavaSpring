package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
		Student st = (Student)context.getBean("studentBean");
		System.out.println(st);
	}

}
