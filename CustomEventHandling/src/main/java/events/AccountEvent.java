package events;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class AccountEvent extends ApplicationEvent {

	// A file output stream to write logs to a file
	static FileOutputStream fos;

	// Static block - runs once when the class is loaded
	static {
		try {
			// Set up log file in user's home directory under DOCS folder
			String logPath = System.getProperty("user.home") + "/DOCS/log.txt";

			// Create/append to log file (true = append mode)
			fos = new FileOutputStream(logPath, true);

		} catch (Exception e) {
			e.printStackTrace(); // Show errors if file can't be opened
		}
	}

	// The message that will be logged
	private String message;

	// Constructor - called when creating a AccountEvent object
	public AccountEvent(Object obj, String message) {
		super(obj); // Call parent class constructor
		this.message = message; // Store the message
	}

	// Method to generate and save the log into log.txt
	public void generateLog() {
		// First print the message to console (for debugging)
		System.out.println("********" + message + "*******");

		try {
			// Add current date/time to the message
			message = new Date().toString() + ":" + message;

			// Add new line at the end
			message = message + "\n";

			// Convert string to bytes (required for file writing)
			byte[] b = message.getBytes();

			// Write to the log file
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace(); // Show errors if writing fails
		}
	}

}
/*
 * Key Concepts Explained: static FileOutputStream - Shared by all instances of
 * this class Static Block - Runs once when class loads (sets up log file)
 * System.getProperty("user.home") - Gets the user's home directory path
 * FileOutputStream(path, true) - true means append to file (not overwrite)
 * ApplicationEvent - Parent class for creating custom events in Spring
 * getBytes() - Converts text to bytes for file writing
 **/
