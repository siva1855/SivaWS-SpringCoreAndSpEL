package siva.spring.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("5--BeanPostProcessor's postProcessBeforeInitilazation() called");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("8--BeanPostProcessor's postProcessAfterInitilazation() called");
		return bean;
	}
}
