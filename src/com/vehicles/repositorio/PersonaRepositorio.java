package com.vehicles.repositorio;

import java.util.*;

import com.vehicles.persona.Persona;

public class PersonaRepositorio {
	
	private static List<Persona> personas=new ArrayList<>();
	private String persona="";
	
	public PersonaRepositorio() {
	
	};
	
	public String getAllPeronas() {
		
		for(Persona p : personas){
			persona+=p.getNom() +" - "+ p.getCognom() +" - "+ p.getData_Naixement() +" - "+ p.getLlicencia() + " \n ";
		}
		return persona;
	}	
	
	public void addPersona(Persona persona) throws Exception{
		if(persona==null) throw new Exception();
		personas.add(persona);
	}

	public List<Persona> getPersonas(){
		return personas;
	}
	
}
