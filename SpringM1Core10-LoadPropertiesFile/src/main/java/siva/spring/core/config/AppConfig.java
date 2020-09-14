package siva.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import siva.spring.core.beans.Product;

@Configuration
@PropertySource({ "MyAppData.properties" })
public class AppConfig {
	@Autowired
	private Environment environment;

	@Bean
	public Product productObject() {
		Product product = new Product();
		product.setProductId(environment.getProperty("id", Integer.class));
		product.setProductName(environment.getProperty("name"));
		product.setProductCost(environment.getProperty("cost", Double.class));
		product.setProductModel(environment.getProperty("model"));
		return product;
	}
}
