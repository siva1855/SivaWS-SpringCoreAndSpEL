package siva.spring.core.beans;

public class UserController {
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
