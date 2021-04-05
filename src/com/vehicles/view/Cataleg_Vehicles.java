package com.vehicles.view;

import javax.swing.JOptionPane;

import com.vehicles.control.VehiclesControl;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class Cataleg_Vehicles {
	
	public static VehiclesControl vehicle = new VehiclesControl();
	
	public static Car coche1;

	public static void main(String[] args) {
		
		
		try {
			vehicle.crearCoche();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
