package siva.spring.core.beans;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void showUserService() {
		System.out.println("UserController Calss");
	}
}
