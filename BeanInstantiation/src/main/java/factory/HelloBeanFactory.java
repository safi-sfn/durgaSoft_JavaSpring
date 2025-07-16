package factory;

import bean.HelloBean;

public class HelloBeanFactory {
	
	public HelloBean getHelloBeanInstance() {
		System.out.println("getHelloBeanInstance() - HelloBeanFactory");
		return new HelloBean();
	}
}
