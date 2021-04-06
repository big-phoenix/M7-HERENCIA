package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color,List<Wheel> wheels) throws Exception {
		super(plate, brand, color);
		this.wheels = wheels;
	}

	public String info_car() {
		
		return "Marca del Moto: " +brand+ " Matricula: " +plate+ " Color: " +color+ " Ruedas: " +wheels;
	}
	
}
