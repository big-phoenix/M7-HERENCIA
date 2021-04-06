package com.vehicles.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.vehicles.control.VehiclesControl;

public class Cataleg_Vehicles {
	
	public static VehiclesControl vehicle = new VehiclesControl();
	

	public static void main(String[] args) {
		
		String[] vehiculos = {
	            "Coche",
	            "Moto"
	        };
		
			ImageIcon icono = new ImageIcon("img/icon.png");
	        String tipo = (String) JOptionPane.showInputDialog(null, 
	        		"Seleccione el tipo de Vehiculo", "Vehiculo", JOptionPane.DEFAULT_OPTION, 
	        		icono, vehiculos, vehiculos[0]);
		
		switch(tipo) {
		
			case "Coche":
				try {
					vehicle.crearCoche();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			case "Moto":
				try {
					vehicle.crearMoto();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
		
		}

	}

}
