package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.LoginService;

public class LoginServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"siva/spring/core/config/LoginService_SpringConfig.xml");

		LoginService service1 = applicationContext.getBean("loginService1", LoginService.class);
		System.out.println(service1);

		LoginService service2 = applicationContext.getBean("loginService2", LoginService.class);
		System.out.println(service2);
	}

}
