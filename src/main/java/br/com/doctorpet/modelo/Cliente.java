package br.com.doctorpet.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author fabrica-jorge
 *
 */
@Entity
@Table(name = "cliente")
public class Cliente extends EntidadeDoctorPet {

	private static final long serialVersionUID = -4156253353745845121L;

	@Id
	@GeneratedValue
	private Long id;

	@Override
	public Long getIdentificador() {
		return id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
