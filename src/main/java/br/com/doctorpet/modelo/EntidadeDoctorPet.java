package br.com.doctorpet.modelo;

import java.io.Serializable;

public abstract class EntidadeDoctorPet implements Entidade, Serializable{

	private static final long serialVersionUID = 3541736857455527807L;
	
	public abstract Long getIdentificador();

}
