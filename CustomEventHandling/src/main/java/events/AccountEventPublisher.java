package events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

//This class is responsible for publishing account-related events
public class AccountEventPublisher implements ApplicationEventPublisherAware {

	// Holds the reference to Spring's event publisher
	private ApplicationEventPublisher publisher;

	// This method is automatically called by Spring to provide the publisher
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// Store the publisher for later use
		this.publisher = publisher;
	}

	// Method to publish custom account events
	public void publish(String message) {
		// 1. Create a new AccountEvent with:
		// - this publisher as the source
		// - the message to be logged
		AccountEvent ae = new AccountEvent(this, message);

		// 2. Ask Spring to publish this event
		// (This will notify all interested listeners)
		publisher.publishEvent(ae);
	}
}