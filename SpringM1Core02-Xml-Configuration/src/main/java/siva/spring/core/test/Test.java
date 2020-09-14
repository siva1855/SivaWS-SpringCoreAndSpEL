package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.Employee;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
		Object obj = applicationContext.getBean("employee");
		Employee employee = (Employee) obj;
		System.out.println(employee);
	}
}
