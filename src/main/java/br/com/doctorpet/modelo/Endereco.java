package br.com.doctorpet.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco extends EntidadeDoctorPet {

	private static final long serialVersionUID = -4536786598869799119L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Funcionario funcionario;

	@ManyToOne
	private ClienteFisico clienteFisico;

	@Column(name = "logradouro", length = 100, nullable = false)
	private String logradouro;

	@Column(name = "numero", length = 10, columnDefinition = "INTEGER")
	private Integer numero;

	@Column(name = "complemento", length = 100)
	private String complemento;

	public Long getId() {
		return id;
	}

	@Override
	public Long getIdentificador() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public ClienteFisico getClienteFisico() {
		return clienteFisico;
	}

	public void setClienteFisico(ClienteFisico clienteFisico) {
		this.clienteFisico = clienteFisico;
	}

}
