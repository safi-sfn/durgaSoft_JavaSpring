package launchApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import beans.CurrentAccount;
import beans.SavingsAccount;
import factory.AccountFactory;

public class LaunchMainApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountFactory savingAccountFactory = (AccountFactory)context.getBean("savingAccountFactory");
		SavingsAccount savingAccount = (SavingsAccount)savingAccountFactory.getAccount();
		
		savingAccount.createAccount();
		savingAccount.searchAccount();
		savingAccount.updateAccount();
		savingAccount.deleteAccount();
		System.out.println();
		AccountFactory currentAccountFactory = (AccountFactory)context.getBean("currentAccountFactory");
		CurrentAccount currentAccount = (CurrentAccount)currentAccountFactory.getAccount();
		currentAccount.createAccount();
		currentAccount.searchAccount();
		currentAccount.updateAccount();
		currentAccount.deleteAccount();
		
//		CurrentAccount currentAccount = (CurrentAccount)
	}

}
