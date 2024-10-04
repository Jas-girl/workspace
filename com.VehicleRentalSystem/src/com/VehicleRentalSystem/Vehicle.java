package com.VehicleRentalSystem;

public abstract class Vehicle {
	String make;
	String model;
	float baseRate;
	public float hour;

	abstract void calculateRental();
}
