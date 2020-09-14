package siva.spring.core.beans;

public class MySingleObject {

	private String myName;

	public MySingleObject() {
		super();
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public String toString() {
		return "MySingleObject [myName=" + myName + "]";
	}

}
