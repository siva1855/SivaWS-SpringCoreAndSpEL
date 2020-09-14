package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import siva.spring.core.beans.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Employee.class);
		Object obj = applicationContext.getBean("employee", Employee.class);
		Employee employee = (Employee) obj;
		System.out.println(employee);

		((AbstractApplicationContext) applicationContext).close();
	}

}
