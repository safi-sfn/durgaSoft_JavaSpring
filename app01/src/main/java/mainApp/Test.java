package mainApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.HelloBean;
import beans.WelcomeBean;
import config.AppConfig;
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		WelcomeBean welcomeBean1 = (WelcomeBean)context.getBean("welcomeBean");  // passing method name as parameter in getBean()
//		WelcomeBean welcomeBean2 = (WelcomeBean)context.getBean(WelcomeBean.class);  // Passing BeanClassName.class as parameter in getBens()
		HelloBean helloBean1 = (HelloBean)context.getBean("helloBean");
//		HelloBean helloBean2 = (HelloBean)context.getBean("helloBean");
		
		System.out.println(welcomeBean1.getWelcomeMessage());
//		System.out.println(welcomeBean1);
//		System.out.println(welcomeBean2);
//		System.out.println(welcomeBean1 == welcomeBean2); //to confirm singleton behavior. (same bean object every time calling getBean())
//		System.out.println(welcomeBean2.getWelcomeMessage());
		System.out.println("******************************");
		System.out.println(helloBean1.sayHello());
//		System.out.println(helloBean1);
//		System.out.println(helloBean2);
//		System.out.println(helloBean1 == helloBean2);
//		System.out.println(helloBean2.sayHello());
///
 
	}

}
