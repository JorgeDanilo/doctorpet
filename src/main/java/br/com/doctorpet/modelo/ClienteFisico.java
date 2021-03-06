package br.com.doctorpet.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.doctorpet.modelo.enums.Sexo;

/**
 * @author fabrica-jorge
 *
 */

@Entity
@Table(name = "cliente_fisico")
public class ClienteFisico extends EntidadeDoctorPet {

	private static final long serialVersionUID = 6852858149004057233L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@Column(length = 100, nullable = false, unique = true)
	private String nome;

	@Column(name = "sexo", length = 45, nullable = false)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(name = "dt_nascimento", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;

	@Column(length = 45, nullable = false)
	private String rg;

	@Column(length = 15, nullable = false)
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public Long getIdentificador() {
		return id;
	}

}
