package siva.spring.core.beans;

import org.springframework.beans.factory.BeanNameAware;

public class IIBeanName implements BeanNameAware {

	private String myName;

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.myName = name;
	}

	@Override
	public String toString() {
		return "IIBeanName [myName=" + myName + "]";
	}

}
