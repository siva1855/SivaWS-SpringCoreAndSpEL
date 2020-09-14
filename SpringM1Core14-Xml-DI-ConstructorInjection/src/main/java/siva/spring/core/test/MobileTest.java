package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.SimCard;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"siva/spring/core/config/Mobile_SpringConfig.xml");

		SimCard simCard = applicationContext.getBean("sim", SimCard.class);
		simCard.simCardDetails();

	}

}
