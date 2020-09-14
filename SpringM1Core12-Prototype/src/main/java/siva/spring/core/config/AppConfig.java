package siva.spring.core.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import siva.spring.core.beans.MySingleObject;

@Configuration
public class AppConfig {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MySingleObject mySingleObjectMethod() {
		return new MySingleObject();
	}
}
