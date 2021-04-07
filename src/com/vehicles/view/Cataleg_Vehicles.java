package com.vehicles.view;

import com.vehicles.control.PersonaControl;
import com.vehicles.persona.Llicencia;

public class Cataleg_Vehicles {
	
	private static PersonaControl titular= new PersonaControl();
	private static PersonaControl conductor= new PersonaControl();
	

	public static void main(String[] args) {
		
			Llicencia llicencia = new Llicencia(00001, "Coche", "Pepe", 2000, 05, 21);
			
			try {
				titular.crearTitular("Pepe", "Martinez", 2021, 02, 15, llicencia, true, false);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
