package siva.spring.core.beans;

public class SimCard {

	private long simNumber;
	private String simName;


	public SimCard() {
		super();
	}


	@Override
	public String toString() {
		return "SimCard [simNumber=" + simNumber + ", simName=" + simName + "]";
	}


	public long getSimNumber() {
		return simNumber;
	}


	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}


	public String getSimName() {
		return simName;
	}


	public void setSimName(String simName) {
		this.simName = simName;
	}


	public void showSimNetwork() {
		System.out.println("SimCard Class");
	}
}
