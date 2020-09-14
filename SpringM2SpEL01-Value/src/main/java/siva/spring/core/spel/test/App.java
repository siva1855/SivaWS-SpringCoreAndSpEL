package siva.spring.core.spel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.spel.beans.Server;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Server obj = (Server) context.getBean("myServer");
		System.out.println(obj);
	}
}