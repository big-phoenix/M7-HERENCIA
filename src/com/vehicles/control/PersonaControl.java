package com.vehicles.control;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.vehicles.persona.Conductor;
import com.vehicles.persona.Llicencia;
import com.vehicles.persona.Titular;
import com.vehicles.repositorio.PersonaRepositorio;

public class PersonaControl {
	
	private PersonaRepositorio repositorio = new PersonaRepositorio();
	
	public PersonaControl() {
		
	}
	
	public void crearTitular(String nom, String cognom, int ano, int mes, int dia, Llicencia llicencia, boolean segur, boolean garatge) throws Exception{		
		
		String llice;
		
		if(llicencia != null) {
			
			Titular titular = new Titular(nom,cognom,ano,mes,dia,llicencia,segur,garatge);
			repositorio.addPersona(titular);
			System.out.println(titular.info_Titular());
			
			llice = titular.getLlicencia(llicencia);
			
			VehiclesControl vehicle = new VehiclesControl(llice);
			
			if(vehicle.getMatch() == true) {
			
				String[] conductor = {
			            "Si",
			            "No"
			    };
				
				ImageIcon icono = new ImageIcon("img/icon.png");
				
				String tipo = (String) JOptionPane.showInputDialog(null, 
		        		"Seras el conductor del Vehiculo", "Conductor", JOptionPane.DEFAULT_OPTION, 
		        		icono, conductor, conductor[0]);
				
				switch(tipo) {
				
				case "Si":
					try {
						crearConductor(nom, cognom, ano, mes, dia, llicencia);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
				
				case "No":
					try {
						nuevoUsuario();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
		
				}
			}
			
			
		}else {
			
			throw new RuntimeException("No tienes la licencia necesaria");
			//System.out.println("No tienes licencia");
		}
	
	}
	
	public void crearConductor(String nom, String cognom, int ano, int mes, int dia, Llicencia llicencia) throws Exception{		
		
		String llice;
		
		if(llicencia != null) {
			
			Conductor conductor = new Conductor(nom,cognom,ano,mes,dia,llicencia);
			repositorio.addPersona(conductor);
			System.out.println(conductor.info_Titular());
			
			llice = conductor.getLlicencia(llicencia);
			
		}else {
			
			throw new RuntimeException("No tienes la licencia necesaria");
			//System.out.println("No tienes licencia");
		}
	
	}
	
	public void nuevoUsuario() {
		
		PersonaControl titular= new PersonaControl();
		
		String nom = JOptionPane.showInputDialog(null,"Introduce tu nombre");
		String cognom = JOptionPane.showInputDialog(null,"Introduce tu apellido");
		
		String ano = JOptionPane.showInputDialog(null,"Introduce el año de nacimiento");
		int anos = Integer.parseInt(ano);
		
		String mes = JOptionPane.showInputDialog(null,"Introduce el mes de nacimiento");
		int mess = Integer.parseInt(mes);
		
		String dia = JOptionPane.showInputDialog(null,"Introduce el dia de nacimiento");
		int dias = Integer.parseInt(dia);
		
		String id = JOptionPane.showInputDialog(null,"Introduce el numero de licencia");
		int ids = Integer.parseInt(id);
		
		String tipo = JOptionPane.showInputDialog(null,"Introduce tu tipo de licecia 'Coche' o 'Moto' o 'Camion'");
		
		Llicencia llicencia = new Llicencia(ids, tipo, nom, anos, mess, dias);
		
		String seguro = JOptionPane.showInputDialog(null,"Tienes seguro 'si' o 'no'");
		String garage = JOptionPane.showInputDialog(null,"Tienes garage 'si' o 'no'");
		boolean segur;
		boolean garatge;
		
		if(seguro == "si" || seguro == "SI") {
			segur = true;
		}else {
			segur = false;
		}
		
		if(garage == "si" || garage == "SI") {
			garatge = true;
		}else {
			garatge = false;
		}
		
		
		try {
			titular.crearTitular(nom, cognom, anos, mess, dias, llicencia, segur, garatge);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
