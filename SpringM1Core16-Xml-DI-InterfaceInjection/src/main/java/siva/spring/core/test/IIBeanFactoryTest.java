package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.IIBeanFactory;

public class IIBeanFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IIBeanFactory-SpringConfig.xml");
		IIBeanFactory iiBeanFactoryObj = applicationContext.getBean("iIBeanFactory", IIBeanFactory.class);
		System.out.println(iiBeanFactoryObj);
	}

}
