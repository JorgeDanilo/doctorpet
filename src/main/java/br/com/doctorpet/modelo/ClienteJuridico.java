package br.com.doctorpet.modelo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author fabrica-jorge
 *
 */
@Entity
@Table(name = "cliente_juridico")
public class ClienteJuridico extends EntidadeDoctorPet {

	private static final long serialVersionUID = -3771953381708744418L;

	@Id
	@GeneratedValue
	private Long id;


	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@Column(name = "razao_social", nullable = false, length = 100)
	private String razaoSocial;

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.doctorpet.modelo.EntidadeDoctorPet#getIdentificador()
	 */
	@Override
	public Long getIdentificador() {
		return id;
	}

}
