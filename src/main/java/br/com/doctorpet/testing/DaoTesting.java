package br.com.doctorpet.testing;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.doctorpet.modelo.Cliente;
import br.com.doctorpet.modelo.ClienteFisico;
import br.com.doctorpet.modelo.ClienteJuridico;
import br.com.doctorpet.modelo.Endereco;
import br.com.doctorpet.modelo.Funcionario;
import br.com.doctorpet.modelo.Login;
import br.com.doctorpet.modelo.Produto;
import br.com.doctorpet.modelo.enums.Grandeza;
import br.com.doctorpet.modelo.enums.Sexo;
import br.com.doctorpet.util.JpaUtil;

public class DaoTesting {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Date dtNascimento = Calendar.getInstance().getTime();
		
		/**
		 * Criacao das instancias das entidades.
		 */
		Cliente cliente = new Cliente();
		ClienteFisico clienteFisico = new ClienteFisico();
		ClienteJuridico clienteJuridico = new ClienteJuridico();
		Login login = new Login();
		Funcionario funcionario = new Funcionario();
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		
		Collection<Cliente> clientes = new ArrayList<Cliente>(); 
		clientes.add(cliente);
		
		clienteFisico.setNome("Jorge");
		clienteFisico.setSexo(Sexo.MASCULINO);
		clienteFisico.setDataNascimento(dtNascimento);
		clienteFisico.setRg("5231409");
		clienteFisico.setCpf("026852r6178");
		clienteFisico.setCliente(cliente);
		
		clienteJuridico.setRazaoSocial("PetShop Gomes");
		clienteJuridico.setCliente(cliente);
		
		funcionario.setClienteFisico(clienteFisico);
		funcionario.setFuncao("Atendente");
		funcionario.setNumCarteiraProfissional("523.648.789.89");
		funcionario.setNum_pis("789.979789745");
		
		produto.setNome("Ração Foster");
		produto.setFabricante("Foster Alimentos");
		produto.setFone("353712569");
		produto.setDescricao("Ração Foster Adulto");
		produto.setGrandeza(Grandeza.SACO);
		produto.setQuantidade(150F);
		produto.setFuncionario(funcionario);
		
		login.setClienteFisico(clienteFisico);
		login.setSenha("12345689");
		
		endereco.setClienteFisico(clienteFisico);
		endereco.setLogradouro("Rua das Agarçias");
		endereco.setNumero(150);
		endereco.setComplemento("Próximo Mercado Bretas");
		endereco.setFuncionario(funcionario);
		
		manager.persist(clienteFisico);
		manager.persist(clienteJuridico);
		manager.persist(funcionario);
		manager.persist(produto);
		manager.persist(login);
		manager.persist(endereco);
		
		trx.commit();
		manager.close();

	}
	

}

