package validator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import beans.Employee;

public class EmployeeValidator implements Validator {
	
	private Resource resource;
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		
		try {
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
		
		
		Employee emp = (Employee) obj;

		if(emp.getEid() == null || emp.getEid() == "") {
			errors.rejectValue("eid", "error.eid.empty", prop.getProperty("error.eid.empty"));
		}else{
				if(!emp.getEid().startsWith("DSS-")) {
					errors.rejectValue("eid", "error.eid.invalid", prop.getProperty("error.eid.invalid"));
				}
		}
		if(emp.getEname() == null || emp.getEname() == "") {
			errors.rejectValue("ename", "error.ename.empty", prop.getProperty("error.ename.empty"));
		}
		
		if(emp.getEsal() <= 0.0f) {
			errors.rejectValue("esal", "error.esal.invalid", prop.getProperty("error.esal.invalid"));
		}
		
		if(emp.getEage() < 18) {
			errors.rejectValue("eage", "error.eage.minage", prop.getProperty("error.eage.minage"));
		}
		else if(emp.getEage() > 30) {
			errors.rejectValue("eage", "error.eage.maxage", prop.getProperty("error.eage.maxage"));
		}
		if(emp.getEemail() == null || emp.getEemail() == "") {
			errors.rejectValue("eemail", "error.eemail.empty", prop.getProperty("error.eemail.empty"));
		}else{
				if (!emp.getEemail().endsWith("@durgasoft.com")) {
					errors.rejectValue("eemail", "error.eemail.invalid", prop.getProperty("error.eemail.invalid"));
				}
		}
		if(emp.getEmobile() == null || emp.getEmobile() == "") {
				errors.rejectValue("emobile", "error.emobile.empty", prop.getProperty("error.emobile.empty"));
		}else{
				if (!emp.getEmobile().startsWith("91-")) {
					errors.rejectValue("emobile", "error.emobile.invalid", prop.getProperty("error.emobile.invalid"));
				}
		}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
