package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.spring.core.beans.Person;
import siva.spring.core.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = (Person) applicationContext.getBean("personObject");
		System.out.println(person);
	}
}
