package events;

import org.springframework.context.ApplicationListener;

//This class listens for AccountEvents and handles them
public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	// This method is automatically called by Spring when an AccountEvent occurs
	@Override
	public void onApplicationEvent(AccountEvent event) {
		// When we receive an event, call its generateLog() method
		System.out.println("Received account event!");
		event.generateLog(); // Writes to file

	}
}