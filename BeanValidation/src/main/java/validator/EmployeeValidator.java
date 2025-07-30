package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import beans.Employee;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		Employee emp = (Employee) obj;

		if (emp.getEid() == null || emp.getEid() == "") {
			errors.rejectValue("eid", "error.eid.required", "User ID is required");
		} 

		if (emp.getEname() == null || emp.getEname().equals("")) {
			errors.rejectValue("uname", "error.uname.required", "User Name is required");
		}

		if (emp.getEsal() <= 0.0f) {
			errors.rejectValue("esal", "error.esal.required", "User Salary invalid");
		}

		if (emp.getEage() < 18) {
			errors.rejectValue("eage", "error.eage.minage", "min age");
		} 

		if (emp.getEemail() == null || emp.getEemail().equals("")) {
			errors.rejectValue("eemail", "error.eemail.required", "email is required");
		}

		if (emp.getEmobile() == null || emp.getEmobile().equals("")) {
			errors.rejectValue("emobile", "error.emobile.required", "Mobile No. is required");
		}

	}

}
