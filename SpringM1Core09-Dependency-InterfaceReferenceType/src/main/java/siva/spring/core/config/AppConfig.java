package siva.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.spring.core.beans.ModelInterface;
import siva.spring.core.beans.ModelInterfaceImpl;
import siva.spring.core.beans.Product;

@Configuration
public class AppConfig {

	@Bean
	public ModelInterface modelInterface() {
		ModelInterfaceImpl modelInterfaceImpl = new ModelInterfaceImpl();
		modelInterfaceImpl.m1();
		modelInterfaceImpl.m2();
		return modelInterfaceImpl;
	}

	@Bean
	public Product productObject() {
		Product product = new Product();
		product.setModelInterface(modelInterface());
		return product;
	}
}
