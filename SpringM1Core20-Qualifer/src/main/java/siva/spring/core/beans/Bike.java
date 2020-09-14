package siva.spring.core.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	public void start() {

		System.out.println("Bike Start method........");
	}

	public void stop() {
		System.out.println("Bike Stop Method......");

	}

}
