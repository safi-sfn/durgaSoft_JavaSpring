package launchApp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import beans.Employee;
import validator.EmployeeValidator;

public class LaunchMainApp {

	public static void main(String[] args) {
		// 1. Initialize Spring Application Context by loading the XML configuration file
				// This reads bean definitions from 'applicationContext.xml' in the classpath
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Get the Employee bean from Spring container using its bean ID
				// The bean is defined in applicationContext.xml with id="employeeBean"
		Employee emp = (Employee) context.getBean("employeeBean");

		// 3. Call method to display employee details
		emp.getEmpDetails();
		System.out.println();

		// 4. Get the EmployeeValidator bean from Spring container
				// This validator contains business rules for employee validation
		EmployeeValidator empValidator = (EmployeeValidator) context.getBean("employeeValidatorBean");

		// 5. Create a Map to store validation errors (field name -> error message)
		Map<String, String> map = new HashMap<String, String>();

		// 6. Create MapBindingResult to hold validation results
			// Parameters: 
			//   - Map to store errors
			//   - Object name being validated (used in error messages)
		MapBindingResult result = new MapBindingResult(map, "beans.Employee");

		// 7. Perform validation of Employee object using the validator
		empValidator.validate(emp, result);

		// 8. Get all validation errors that occurred
		List<ObjectError> list = result.getAllErrors();

		// 9. Iterate through and print all validation error messages
		for (ObjectError error : list) {
		    System.out.println(error.getDefaultMessage());
		}
		
	}
}

