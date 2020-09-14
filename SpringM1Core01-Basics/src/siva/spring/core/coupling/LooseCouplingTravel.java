package siva.spring.core.coupling;

public class LooseCouplingTravel {

	//HAS-A Relation
	Vehicle vehicle;
	Car car;
	Bike bike;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void journey() {
		vehicle.move();
	}

	public static void main(String[] args) {
		
		LooseCouplingTravel travel = new LooseCouplingTravel();
		
		travel.setVehicle(new Car());   // Inject Car dependency
		travel.journey();             
		
		travel.setVehicle(new Bike());// Inject Bike dependency
		travel.journey();   

	}
}
