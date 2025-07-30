package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplacerImpl implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("Course Details");
		System.out.println("-----------------");
		System.out.println("Course Id :C-222");
		System.out.println("Course Name :.NET");
		System.out.println("Course Cost :20000");
		return null;
	}

}
