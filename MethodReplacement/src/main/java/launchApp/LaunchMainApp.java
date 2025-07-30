package launchApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Course;

public class LaunchMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course=(Course)context.getBean("course");
		course.getCourseDetails();
	}

}
