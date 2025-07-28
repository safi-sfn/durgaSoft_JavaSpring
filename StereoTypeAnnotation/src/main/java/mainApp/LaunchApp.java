package mainApp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.StudentController;

public class LaunchApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentController studentController = (StudentController) context.getBean("studentController");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.print("Your Option[1,2,3,4,5] : ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				studentController.addStudent();
				break;
			case 2:
				studentController.searchStudent();
				break;
			case 3:
				studentController.updateStudent();
				break;
			case 4:
				studentController.deleteStudent();
				break;
			case 5:
				System.out.println("*******Thankyou For Using this Application*******");
				System.exit(0);
				break;
			default:
				System.out.println("Enter the option from 1,2,3,4 and 5.");
				break;
			}
		}

	}

}
