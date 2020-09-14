package siva.spring.core.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.spring.core.beans.UserDao;
import siva.spring.core.beans.UserService;

public class UserTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"User_SpringConfig.xml");

		UserDao userDao = applicationContext.getBean("dao1", UserDao.class);
		userDao.Userdetails();

		UserService userService = applicationContext.getBean("service1", UserService.class);
		userService.showUserService();
	}
}
