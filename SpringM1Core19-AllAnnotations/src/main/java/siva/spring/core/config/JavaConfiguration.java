package siva.spring.core.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "siva.spring.core")
@PropertySource("classpath:MovieService.properties")
public class JavaConfiguration {

	@Bean
	@Primary
	public List<String> familyNamesList() {
		return Arrays.asList("Sivakumar", "Annapurna", "Ramadevi", "Saidarao", "Cherry", "Milky");
	}

	@Bean
	public List<String> friendsNamesList() {
		return Arrays.asList("Srinu", "Praveen", "Anji", "Laksmi", "Hemalatha");
	}
}
