package launchApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloBean;
import bean.WelcomeBean;
import bean.WishBean;

public class LaunchMainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		WishBean wishBean = (WishBean) context.getBean("wishBean");
//		System.out.println(wishBean.wish());
		
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		
		WelcomeBean welcomeBean = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welcomeBean.sayWelcome());
		
	}

}
