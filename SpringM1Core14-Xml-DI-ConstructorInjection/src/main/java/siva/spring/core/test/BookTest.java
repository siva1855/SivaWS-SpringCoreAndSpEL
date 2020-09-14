package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.Book;



public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"siva/spring/core/config/Book_SpringConfig.xml");

		Book books = applicationContext.getBean("book", Book.class);

		System.out.println(books);
		
		
	}

}
