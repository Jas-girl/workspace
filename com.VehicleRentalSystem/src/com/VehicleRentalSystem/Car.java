package com.VehicleRentalSystem;

public class Car extends Vehicle {
    Car(String make,String model,float baseRate,int hour){
    	super.make=make;
    	super.model=model;
    	super.baseRate=baseRate;
    	 super.hour=hour;
    	 
    }

	@Override
	public String toString() {
		return "Car [Make="+make+" model="+model+" baseRate="+baseRate+" hour=" + hour + "]";
	}

	@Override
	void calculateRental() {
		System.out.println("Cars are charged on hourly basis");

		
	}
}
