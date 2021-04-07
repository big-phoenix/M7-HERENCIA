package com.vehicles.persona;

public class Conductor extends Persona {
	
	private Llicencia llicencia;

	public Conductor(String nom, String cognom, int ano, int mes, int dia, Llicencia llicencia) {
		super(nom, cognom, ano, mes, dia, llicencia);
		this.llicencia = llicencia;
	}

	public String getLlicencia(Llicencia llicencia) {
		return llicencia.getTipus();
	}
	
	public String info_Titular() {
		return "Nombre del Conductor: " +nom+ " Apellido: " +cognom+ " Fecha de Nacimiento: " +data_naixement+ 
				" Licencia: " +llicencia;
	}
	
}
