package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.A;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"siva/spring/core/config/SpringConfig.xml");

		A a = applicationContext.getBean("aaa", A.class);

		a.doSomeThing();

	}
}
