package br.com.doctorpet.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente_Juridico {

	@Id
	@GeneratedValue
	private Long id;
}
