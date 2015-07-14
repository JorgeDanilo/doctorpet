package br.com.doctorpet.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente_Juridico extends EntidadeDoctorPet{

	private static final long serialVersionUID = -3771953381708744418L;
	
	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getIdentificador() {
		return id;
	}
}
