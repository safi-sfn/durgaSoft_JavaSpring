package launchApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.HelloBean;

/*
 * IN Spring applications we are able to use the following three approaches to create Bean
	objects.
	1.By using Constructor directly.
	2.By Using Static Factory Method
	3.By Using Instance Factory Method
 */

public class LaunchApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean helloBean = (HelloBean) context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
	}

}
