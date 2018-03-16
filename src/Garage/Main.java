package Garage;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.addVehicle(new Car());
		garage.addVehicle(new Motorbike());
		garage.addVehicle(new HoverCraft());
		
		garage.showGarage();
		garage.bill();
		garage.removeVehicle(new Motorbike());
		
		garage.showGarage();
		garage.emptyGarage();
		garage.showGarage();
		
		
		
	
	}

}
