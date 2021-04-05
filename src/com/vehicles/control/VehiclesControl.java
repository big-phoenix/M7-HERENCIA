package com.vehicles.control;

import java.util.*;

import javax.swing.JOptionPane;

import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class VehiclesControl {
	
	
	
	
	public VehiclesControl() {
		
	}
	
	public void crearCoche() throws Exception{		
		
		String plate = JOptionPane.showInputDialog(null,"Introduce la matricula del Vehiculo");
		String brand = JOptionPane.showInputDialog(null,"Introduce la marca del Vehiculo");
		String color = JOptionPane.showInputDialog(null,"Introduce el color del Vehiculo");
		
		String marca = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas delateras");
		double diametro = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el diametro de la rueda"));
		String marca2 = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas traseras");
		double diametro2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el diametro de la rueda"));
		
		Wheel F_ruedas = new Wheel(marca, (double)diametro);
		Wheel B_ruedas = new Wheel(marca2, (double)diametro2);
		
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		wheels.add(F_ruedas);
		wheels.add(B_ruedas);
		
		Car coche = new Car(plate, brand, color,wheels);
		
		System.out.println(coche.info_car());
		
	}

}
