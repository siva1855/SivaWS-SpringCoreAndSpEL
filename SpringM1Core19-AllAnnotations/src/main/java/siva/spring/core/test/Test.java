package siva.spring.core.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.spring.core.config.JavaConfiguration;
import siva.spring.core.service.MovieService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		MovieService movieServiceObj = applicationContext.getBean("movieService", MovieService.class);
		movieServiceObj.getTheaterOfMovie();
		System.out.println("..........................................................");
		movieServiceObj.showFamilyNames();

	}

}
