package com.VehicleRentalSystem;

public class RentalServices {

	void totalCost(Vehicle obj) {
		System.out.println(obj);
		obj.calculateRental();
		System.out.println("BaseRate:"+obj.baseRate+"/hour");
		System.out.println(obj.baseRate*obj.hour);}
		
		void totalCost1(Vehicle obj1) {
			System.out.println(obj1);
			obj1.calculateRental();
			System.out.println("BaseRate:"+obj1.baseRate/2+"/hour");
			System.out.println(obj1.baseRate/2*obj1.hour);
	
		
	}
		void totalCost2(Vehicle obj2) {
			System.out.println(obj2);
			obj2.calculateRental();
			System.out.println("BaseRate:"+obj2.baseRate+"/hour");
			System.out.println(obj2.baseRate*obj2.hour+100);
	
		
	}
}
