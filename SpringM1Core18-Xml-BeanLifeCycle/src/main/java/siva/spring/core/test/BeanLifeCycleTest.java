package siva.spring.core.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.BeanLifeCycle;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"BeanLifeCycle-SpringConfig.xml");
		BeanLifeCycle beanLifeCycleObj = classPathXmlApplicationContext.getBean("beanLifeCycle", BeanLifeCycle.class);
		beanLifeCycleObj.customServiceMethod();
		classPathXmlApplicationContext.close();
	}

}
