package siva.spring.core.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {

	public void start() {
		System.out.println("Car Start method.......");
	}

	public void stop() {
		System.out.println("Car Stop Method...............");
	}

}
