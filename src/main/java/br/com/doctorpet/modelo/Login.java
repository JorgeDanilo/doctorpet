package br.com.doctorpet.modelo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login extends EntidadeDoctorPet {

	private static final long serialVersionUID = -6354387646016741486L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "senha", nullable = false, length = 45)
	private String senha;

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


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
