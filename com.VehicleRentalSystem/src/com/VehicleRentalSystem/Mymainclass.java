package com.VehicleRentalSystem;

public class Mymainclass {
 public static void main(String[] args) {
	Vehicle obj=new Car("Maruti", "Sazuki", 50, 3);
	RentalServices services=new RentalServices();
	services.totalCost(obj);
	
	
	
	 Vehicle obj1=new Bike("Giant","Escape3",60,7);
		services.totalCost1(obj1);
	
		
		 Vehicle obj2=new Truck("Giant","Escape3",60,7);
		 services.totalCost2(obj2);
	
	
}
}
