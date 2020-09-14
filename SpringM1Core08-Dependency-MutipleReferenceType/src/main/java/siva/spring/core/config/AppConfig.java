package siva.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.spring.core.beans.ExampleOne;
import siva.spring.core.beans.ExampleThree;
import siva.spring.core.beans.ExampleTwo;

@Configuration
public class AppConfig {
	
	@Bean
	public ExampleOne exampleOneObject() {
		ExampleOne exampleOne = new ExampleOne();
		exampleOne.setExampleTwo(exampleTwoObject());
		return exampleOne;
	}

	@Bean
	public ExampleTwo exampleTwoObject() {
		ExampleTwo exampleTwo = new ExampleTwo();
		exampleTwo.setExampleThree(exampleThreeObject());
		return exampleTwo;
	}

	@Bean
	public ExampleThree exampleThreeObject() {
		ExampleThree exampleThree = new ExampleThree();
		exampleThree.setId(1855);
		return exampleThree;
	}
}
