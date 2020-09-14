package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import siva.spring.core.beans.MySingleObject;
import siva.spring.core.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MySingleObject mySingleObject1 = (MySingleObject) applicationContext.getBean("mySingleObjectMethod");
		mySingleObject1.setMyName("siva");
		System.out.println(mySingleObject1.getMyName());

		MySingleObject mySingleObject2 = (MySingleObject) applicationContext.getBean("mySingleObjectMethod");
		System.out.println(mySingleObject2.getMyName());

		MySingleObject mySingleObject3 = (MySingleObject) applicationContext.getBean("mySingleObjectMethod");
		System.out.println(mySingleObject3.getMyName());
		
		MySingleObject mySingleObject4 = (MySingleObject) applicationContext.getBean("mySingleObjectMethod");
		System.out.println(mySingleObject4.getMyName());
		
		((AbstractApplicationContext) applicationContext).close();
	}
}
