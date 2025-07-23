package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
	    Employee emp = (Employee)context.getBean("employee");
	    emp.showEmpDetails();

	}

}
