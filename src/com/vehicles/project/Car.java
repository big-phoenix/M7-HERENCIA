package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color,List<Wheel> wheels) {
		super(plate, brand, color);
		this.wheels = wheels;
	}
	
	
	public String info_car() {
		
		return "Marca del Coche: " +brand+ " Matricula: " +plate+ " Color: " +color+ " Ruedas: " +wheels;
	}


}
