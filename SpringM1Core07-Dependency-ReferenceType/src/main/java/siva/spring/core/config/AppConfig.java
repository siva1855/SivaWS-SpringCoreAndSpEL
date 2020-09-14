package siva.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.spring.core.beans.Model;
import siva.spring.core.beans.Product;

@Configuration
public class AppConfig {

	@Bean
	public Model modelObject() {
		Model model = new Model();
		model.setModelNumber(11.4d);
		return model;
	}
	@Bean
	public Product productObject() {
		Product product = new Product();
		product.setProductName("Redmi 6");
		product.setModel(modelObject());
		return product;
	}
}
