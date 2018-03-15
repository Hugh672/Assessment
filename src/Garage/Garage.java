package Garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> theGarage = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle v){
	      theGarage.add(v);
	}
	
	public void removeVehicle(Vehicle v){
		
		ArrayList<Vehicle> tempList = new ArrayList<Vehicle>();
		
		for(Vehicle x : theGarage){
			
			if(x instanceof Motorbike) {
				x = (Motorbike) x;
//				theGarage.remove(x);
				tempList.add(x);
			}
			
			if(x instanceof Car) {
				x = (Car) x;
//				theGarage.remove(x);
				tempList.add(x);
			}
		
			if(x instanceof HoverCraft) {
				x = (HoverCraft) x;
//				theGarage.remove(x);
				tempList.add(x);
			}
		}
		
		theGarage.removeAll(tempList);
		
		System.out.println(theGarage);
		
		
	}

public void bill() {
	int totalCost = 0;
	
	for (Vehicle V : theGarage) {
		
		if(V instanceof Motorbike) {
			V = (Motorbike) V;
			totalCost += V.value;
		}
	
		if(V instanceof Car) {
			V = (Car) V;
			totalCost += V.value;
		}
	
		if(V instanceof HoverCraft) {
			V = (HoverCraft) V;
			totalCost += V.value;
		}
	}
	System.out.println("Your Total Payable Balance: " + " " + totalCost);
}

public void emptyGarage() {
	System.out.println("The garage is empty");
	theGarage.clear();
	
}
public void showGarage() {
	
	int car = 0;
	int motorbike = 0;
	int hovercraft = 0;
	
	for(Vehicle v : theGarage){
		
		if(v instanceof Car) {
			v = (Car) v;
			car++;
		}
		if(v instanceof Motorbike) {
			motorbike++;
			}
		
		if(v instanceof HoverCraft) {
			v = (HoverCraft) v;
			hovercraft++;
		
		}	
	}
	System.out.println("Cars: "+ car + ", Motorbikes: "+ motorbike + ", Hovercrafts: "+ hovercraft );

}
	
	
	
}