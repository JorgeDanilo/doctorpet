package br.com.doctorpet.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente extends EntidadeDoctorPet{

	private static final long serialVersionUID = -4156253353745845121L;
	
	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getIdentificador() {
		return id;
	}
	
	
}
