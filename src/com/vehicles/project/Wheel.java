package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
	
		this.brand = brand;
		this.diameter = diameter;
				
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
}
