package launchApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Students;

public class LaunchMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get beans by type
//		Students student = context.getBean(Students.class);

		// Get beans by Id
		Students student = (Students) context.getBean("studentBean");
		Students student2 = (Students) context.getBean("studentBean");

		// Singleton scope |=| Same Object for different bean |singleton is default
		// scope in spring =| scope=prototype means different object for each bean 
	
		System.out.println(student);
		System.out.println(student2);

		Students student3 = (Students) context.getBean("studentBean2");
		Students student4 = (Students) context.getBean("studentBean2");

		// Singleton scope |=| Same Object for different bean
		System.out.println(student3);
		System.out.println(student4);

//		student.showStudent();
	}

}
