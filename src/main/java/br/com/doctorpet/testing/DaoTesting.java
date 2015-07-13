package br.com.doctorpet.testing;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.doctorpet.modelo.Cliente;
import br.com.doctorpet.util.JpaUtil;

public class DaoTesting {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Date dtNascimento = Calendar.getInstance().getTime();
		Cliente pf = new Cliente();
		pf.setCpf("02685068782");
		pf.setDataNascimento(dtNascimento);
		pf.setRg("5231408");
		
		manager.persist(pf);
		trx.commit();
		manager.close();
	}
	

}

