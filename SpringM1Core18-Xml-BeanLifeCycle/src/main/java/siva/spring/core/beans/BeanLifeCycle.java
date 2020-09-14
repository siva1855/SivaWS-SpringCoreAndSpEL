package siva.spring.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycle implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String message;

	public BeanLifeCycle() {
		System.out.println("1--Bean Object is Created");
	}

	public void customInitMethod() {
		System.out.println("7--customInitMethod() called");
	}

	public void customDestroyMethod() {
		System.out.println("11--customDestroyMethod() called");
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("2--Dependencies are injected === "+message);
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("10--DisposableBean's destroy() called");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("6--InitializingBean's afterPropertiesSet() called");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4--ApplicationContextAware's setApplicationContext() called");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3--BeanNameAware's setBeanName() called");
	}

	public void customServiceMethod() {
		System.out.println("9--customServiceMethod() called");
	}
}
