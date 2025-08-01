package launchApp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Account;

public class LaunchMainApp {

	public static void main(String[] args)throws Exception {
		
		   // 1. Start Spring container and load configuration
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Get the Account bean from Spring container
		Account account=(Account)context.getBean("account");
		
		 // 3. Use the account bean to perform operations
		  account.createAccount();    // → "Account Created" + publishes event
		    account.searchAccount();   // → "Account Identified" + publishes event
		    account.updateAccount();   // → "Account Updated" + publishes event
		    account.deleteAccount();   // → "Account Deleted" + publishes event
		    
		 // Note: The 'throws Exception' means we're not handling errors here
		    // In real apps, you should use try-catch blocks
	}

}
