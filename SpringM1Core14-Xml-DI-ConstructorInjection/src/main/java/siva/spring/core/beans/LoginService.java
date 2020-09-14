package siva.spring.core.beans;

public class LoginService {

	private String userName;
	private String password;
	private int phoneNumber;

	public LoginService(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	public LoginService(int phoneNumber, String password) {

		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginService [userName=" + userName + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}

}
