package com.vehicles.control;

import java.util.*;
import java.util.regex.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.vehicles.project.Bike;
import com.vehicles.project.Car;
import com.vehicles.project.Truck;
import com.vehicles.project.Wheel;
import com.vehicles.repositorio.PersonaRepositorio;

public class VehiclesControl {
	
	private PersonaRepositorio repositorio;
	private boolean match = true;
	
	String[] vehiculos = {
            "Coche",
            "Moto",
            "Camion"
        };
	
	ImageIcon icono = new ImageIcon("img/icon.png");
	
	private String llicencia;

	public VehiclesControl(String llicencia) {
		
		this.llicencia = llicencia;
		
		String tipo = (String) JOptionPane.showInputDialog(null, 
        		"Seleccione el tipo de Vehiculo", "Vehiculo", JOptionPane.DEFAULT_OPTION, 
        		icono, vehiculos, vehiculos[0]);
		
		if(llicencia == "Coche" && tipo == "Coche") {
			Ejecuta(tipo);
		}else if(llicencia == "Moto" && tipo == "Moto") {
			Ejecuta(tipo);
		}else if(llicencia == "Camion" && tipo == "Camion") {
			Ejecuta(tipo);
		}else{
			match=false;
			System.out.println("No tiene la licencia: '" +tipo+ "' necesaria para adquirlo");
		}
		
	}
	
	
	public void Ejecuta(String tipo) {
		
		switch(tipo) {
		
		case "Coche":
			try {
				crearCoche();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		
		case "Moto":
			try {
				crearMoto();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		
		case "Camion":
			try {
				crearCamion();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
	
	}
		
	}
	
	public boolean getMatch() {
		return match;
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
		
		Bike bike = new Bike(plate, brand, color,wheels);
		
		System.out.println(bike.info_bike());
		
	}
	
	public void crearCamion() throws Exception{		
		
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
		
		Truck truck = new Truck(plate, brand, color,wheels);
		
		System.out.println(truck.info_truck());
		
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
