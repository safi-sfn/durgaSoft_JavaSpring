package bean;

import events.AccountEventPublisher;

//This class represents a bank account and its operations
public class Account {

	// Reference to our event publisher (like a loudspeaker for announcements)
	private AccountEventPublisher publisher;

	// Spring will call this to give us the publisher (Dependency Injection)
	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}

	// Account creation method
	public void createAccount() {
		System.out.println("Account Created"); // Console log
		publisher.publish("AccountCreated"); // Broadcast event
	}

	// Account search method
	public void searchAccount() {
		System.out.println("Account Identified");
		publisher.publish("AccountIdentified"); // Different event type
	}

	// Account update method
	public void updateAccount() {
		System.out.println("Account Updated");
		publisher.publish("AccountUpdated");
	}

	// Account deletion method
	public void deleteAccount() {
		System.out.println("Account Deleted");
		publisher.publish("AccountDeleted");
	}
}
