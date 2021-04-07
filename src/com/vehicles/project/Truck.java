package com.vehicles.project;

import java.util.List;

public class Truck extends Vehicle {

	public Truck(String plate, String brand, String color,List<Wheel> wheels) throws Exception {
		super(plate, brand, color);
		this.wheels = wheels;
	}
	
	
	public String info_truck() {
		
		return "Marca del Camion: " +brand+ " Matricula: " +plate+ " Color: " +color+ " Ruedas: " +wheels;
	}


}