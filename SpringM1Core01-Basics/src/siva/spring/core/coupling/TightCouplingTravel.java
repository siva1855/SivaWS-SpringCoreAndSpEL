package siva.spring.core.coupling;

public class TightCouplingTravel {

	Vehicle vehicle = new Car();   

	void journey() {
		vehicle.move();
	}

	public static void main(String[] args) {
		
		TightCouplingTravel travel = new TightCouplingTravel();
		travel.journey();
	}

}
