package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import siva.spring.core.beans.SingletonClass;

public class LMITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("LMI-SpringConfig.xml");
		SingletonClass singletonClassObject = applicationContext.getBean("singletonClass", SingletonClass.class);

		singletonClassObject.receive();
		System.out.println("....................................");

		singletonClassObject.receive();
		System.out.println("....................................");

		singletonClassObject.receive();
		System.out.println("....................................");
	}
}
