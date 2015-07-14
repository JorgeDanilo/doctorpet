package br.com.doctorpet.testing;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.doctorpet.modelo.Cliente;
import br.com.doctorpet.modelo.ClienteFisico;
import br.com.doctorpet.modelo.ClienteJuridico;
import br.com.doctorpet.modelo.Funcionario;
import br.com.doctorpet.modelo.Login;
import br.com.doctorpet.modelo.Produto;
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
		
		Collection<Cliente> clientes = new ArrayList<Cliente>(); 
		clientes.add(cliente);
		
		clienteFisico.setNome("Jorge");
		clienteFisico.setSexo(Sexo.MASCULINO);
		clienteFisico.setDataNascimento(dtNascimento);
		clienteFisico.setRg("5231409");
		clienteFisico.setCpf("026852r6178");
		clienteFisico.setCliente(cliente);
		
		clienteJuridico.setRazaoSocial("InfoComputerTecnologies");
		clienteJuridico.setCliente(cliente);
		
		manager.persist(clienteFisico);
		manager.persist(clienteJuridico);
		trx.commit();
		manager.close();

	}
	

}

