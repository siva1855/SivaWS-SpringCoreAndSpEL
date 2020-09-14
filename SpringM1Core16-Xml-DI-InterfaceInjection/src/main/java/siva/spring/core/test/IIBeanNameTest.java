package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.IIBeanName;

public class IIBeanNameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IIBeanName-SpringConfig.xml");
		IIBeanName beanNameObj = applicationContext.getBean("iibeanName", IIBeanName.class);
		System.out.println(beanNameObj);
	}

}
