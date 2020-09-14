package siva.spring.core.beans;

public class SimCard {
	private String provider;

	public SimCard(String provider) {
		super();
		this.provider = provider;
	}

	public void simCardDetails() {
		System.out.println("SimCard Class");
	}
}
