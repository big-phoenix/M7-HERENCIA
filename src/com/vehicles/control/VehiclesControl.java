package com.vehicles.control;

import java.util.*;
import java.util.regex.*;

import javax.swing.JOptionPane;

import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class VehiclesControl {
	
	
	
	
	public VehiclesControl() {
		
	}
	
	public void crearCoche() throws Exception{		
		
		String plate = comprobar_matricula();
		String brand = JOptionPane.showInputDialog(null,"Introduce la marca del Vehiculo");
		String color = JOptionPane.showInputDialog(null,"Introduce el color del Vehiculo");
		
		String marca = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas delateras");
		double diametro = comprobar_diametro();
		String marca2 = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas traseras");
		double diametro2 = comprobar_diametro();
		
		Wheel F_ruedas = new Wheel(marca, (double)diametro);
		Wheel B_ruedas = new Wheel(marca2, (double)diametro2);
		
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		wheels.add(F_ruedas);
		wheels.add(B_ruedas);
		
		Car coche = new Car(plate, brand, color,wheels);
		
		System.out.println(coche.info_car());
		
	}
	
	
	public void crearMoto() throws Exception{		
		
		String plate = comprobar_matricula();
		String brand = JOptionPane.showInputDialog(null,"Introduce la marca del Vehiculo");
		String color = JOptionPane.showInputDialog(null,"Introduce el color del Vehiculo");
		
		String marca = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas delateras");
		double diametro = comprobar_diametro();
		String marca2 = JOptionPane.showInputDialog(null,"Introduce la marca de la ruedas traseras");
		double diametro2 = comprobar_diametro();
		
		Wheel F_ruedas = new Wheel(marca, (double)diametro);
		Wheel B_ruedas = new Wheel(marca2, (double)diametro2);
		
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		wheels.add(F_ruedas);
		wheels.add(B_ruedas);
		
		Car coche = new Car(plate, brand, color,wheels);
		
		System.out.println(coche.info_car());
		
	}
	
	
	
	public double comprobar_diametro() {
		
		double diametre;
				
			do {
				
				diametre = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el diametro correcto entre 0.4 y 4"));
				
			} while(diametre<=0.4 || diametre>=4);
		
		return diametre;
	}
	
	public String comprobar_matricula() {
		
		String plate;
	
		Pattern pat = Pattern.compile("^\\d{4}[a-zA-Z]{2,3}");
		Matcher mat;
		
     	do {
			
     		plate = JOptionPane.showInputDialog(null,"Introduce la matricula del Vehiculo"); 		
     		mat = pat.matcher(plate);
			
		} while(!mat.matches());
     	
		return plate;
		
	}

}
