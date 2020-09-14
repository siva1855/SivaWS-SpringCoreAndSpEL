package siva.spring.core.beans;

public class Mobile {
	
	private SimCard simCard;

	public Mobile() {
		super();
	}

	public SimCard getSimCard() {
		return simCard;
	}

	public void setSimCard(SimCard simCard) {
		this.simCard = simCard;
	}

	@Override
	public String toString() {
		return "Mobile [simCard=" + simCard + "]";
	}

}
