package com.VehicleRentalSystem;

public  class Truck extends Vehicle {
	Truck(String make,String model,float baseRate,int hour){
    	super.make=make;
    	super.model=model;
    	super.baseRate=baseRate;
    	 super.hour=hour;
    	 
    }
	@Override
	public String toString() {
		return "Bike [Make="+make+" model="+model+" baseRate="+baseRate+" hour=" + hour + "]";
	}
	void calculateRental() {
		System.out.println("Additional charges for truck for rent is 100/-");
	
		
	}
}
