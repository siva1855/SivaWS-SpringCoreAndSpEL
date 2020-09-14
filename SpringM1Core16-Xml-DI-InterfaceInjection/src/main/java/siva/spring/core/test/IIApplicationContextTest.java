package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.IIApplicationContext;

public class IIApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("IIApplicationContext-SpringConfig.xml");
		IIApplicationContext iiApplicationContext = container.getBean("iIApplicationContext",
				IIApplicationContext.class);
		System.out.println(iiApplicationContext);
	}

}
