package br.com.doctorpet.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author fabrica-jorge
 *
 */
@Entity
@Table(name = "funcionario")
public class Funcionario extends EntidadeDoctorPet {

	private static final long serialVersionUID = 6633828162064789444L;

	@Id
	@GeneratedValue
	private Long id;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.doctorpet.modelo.EntidadeDoctorPet#getIdentificador()
	 */
	@Override
	public Long getIdentificador() {
		return id;
	}

	@Column(name = "funcao", length = 45, nullable = false)
	private String funcao;

	@Column(name = "num_carteira_profissional", nullable = false, length = 45)
	private String numCarteiraProfissional;

	@Column(name = "num_pis", nullable = false, length = 15)
	private String num_pis;

	@Lob
	@Column(name = "foto", columnDefinition = "BLOB")
	private byte[] foto;

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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNumCarteiraProfissional() {
		return numCarteiraProfissional;
	}

	public void setNumCarteiraProfissional(String numCarteiraProfissional) {
		this.numCarteiraProfissional = numCarteiraProfissional;
	}

	public String getNum_pis() {
		return num_pis;
	}

	public void setNum_pis(String num_pis) {
		this.num_pis = num_pis;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
