package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.spring.core.beans.ExampleOne;
import siva.spring.core.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ExampleOne exampleOne = (ExampleOne) applicationContext.getBean("exampleOneObject");
		System.out.println(exampleOne);
	}
}
