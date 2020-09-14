package siva.spring.core.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.spring.core.service.VehicleService;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("siva.spring.core");
		annotationConfigApplicationContext.refresh();
		VehicleService vehicleService = annotationConfigApplicationContext.getBean(VehicleService.class);
		vehicleService.service();
		annotationConfigApplicationContext.close();
	}

}
