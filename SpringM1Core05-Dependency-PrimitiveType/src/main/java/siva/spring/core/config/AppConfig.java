package siva.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.spring.core.beans.Person;

@Configuration
public class AppConfig {
	@Bean
	public Person personObject() {
		
		Person person = new Person();
		person.setMemory((byte) 50);
		person.setWidth((short) 3);
		person.setAge(25);
		person.setMobileNumber(8142651855L);
		person.setSalary(35000.50);
		person.setHeight(5.6F);
		person.setHealth(true);
		person.setGender('M');
		person.setName("Sivakumar");

		return person;
	}
}
