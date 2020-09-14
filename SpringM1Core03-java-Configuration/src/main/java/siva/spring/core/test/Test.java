package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.spring.core.beans.Employee;
import siva.spring.core.config.JavaAppConfiguration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaAppConfiguration.class);
		Object obj = applicationContext.getBean("employee",Employee.class);
		Employee employee = (Employee) obj;
		System.out.println(employee);
	}

}
