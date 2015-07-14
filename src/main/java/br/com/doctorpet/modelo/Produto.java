package br.com.doctorpet.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import br.com.doctorpet.modelo.enums.Grandeza;

/**
 * @author fabrica-jorge
 *
 */
@Entity
@Table(name = "produto")
public class Produto extends EntidadeDoctorPet {

	private static final long serialVersionUID = -1709338262436292544L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "fabricante", nullable = false, length = 100)
	private String fabricante;

	@Column(name = "telefone", length = 45)
	private String telefone;

	@Column(name = "descricao", length = 100)
	private String descricao;

	@Column(name = "grandeza", length = 45)
	@Enumerated(EnumType.STRING)
	private Grandeza grandeza;

	@Column(precision = 2, nullable = false, length = 10)
	private float quantidade;

	@Lob
	@Column(name = "foto", columnDefinition = "BLOB")
	private byte[] foto;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.doctorpet.modelo.EntidadeDoctorPet#getIdentificador()
	 */
	@Override
	public Long getIdentificador() {
		return id;
	}

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

	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return
	 */
	public String getFone() {
		return telefone;
	}

	/**
	 * @param fone
	 */
	public void setFone(String fone) {
		this.telefone = fone;
	}

	/**
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return
	 */
	public Grandeza getGrandeza() {
		return grandeza;
	}

	/**
	 * @param grandeza
	 */
	public void setGrandeza(Grandeza grandeza) {
		this.grandeza = grandeza;
	}

	/**
	 * @return
	 */
	public float getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade
	 */
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return
	 */
	public byte[] getFoto() {
		return foto;
	}

	/**
	 * @param foto
	 */
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
