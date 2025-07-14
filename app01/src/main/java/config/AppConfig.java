package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.HelloBean;
import beans.WelcomeBean;

@Configuration
public class AppConfig {
		
	static {
		System.out.println("AppConfig class Loading....");
	}
	public AppConfig() {
		System.out.println("AppConfig class Instantiation....");
	}
	
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean welcomeBean = new WelcomeBean();
		welcomeBean.setName("Durga");
			return welcomeBean;
		}
	@Bean
	public HelloBean helloBean() {
		HelloBean helloBean = new HelloBean();
		helloBean.setName("Durga");
		return  helloBean;
	}
}
