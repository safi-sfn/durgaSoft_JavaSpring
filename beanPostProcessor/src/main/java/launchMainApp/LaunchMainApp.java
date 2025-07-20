package launchMainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Account;

public class LaunchMainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account acc = (Account) context.getBean("accBean");
		acc.getAccountDetails();
	}

}
