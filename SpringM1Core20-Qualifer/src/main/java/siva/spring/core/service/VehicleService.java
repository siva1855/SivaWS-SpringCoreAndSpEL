package siva.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import siva.spring.core.beans.Vehicle;

@Component
public class VehicleService {
	@Autowired
	@Qualifier("bikeBean")
	private Vehicle vehicle;

	public void service() {
		vehicle.start();
		vehicle.stop();
	}

}
