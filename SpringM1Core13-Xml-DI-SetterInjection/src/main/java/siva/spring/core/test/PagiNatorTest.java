package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.Page;
import siva.spring.core.beans.PagiNator;

public class PagiNatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"Paginator_SpringConfig.xml");

		PagiNator pagiNator = applicationContext.getBean("pagiNator", PagiNator.class);
		pagiNator.showPagiNator();

		Page page = applicationContext.getBean("pageId", Page.class);
		page.showPages();
	}

}
