package siva.spring.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class IIBeanFactory implements BeanFactoryAware {

	private BeanFactory beanFactory;

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory = beanFactory;

	}

	@Override
	public String toString() {
		return "IIBeanFactory [beanFactory=" + beanFactory + "]";
	}

}
