package br.com.doctorpet.util;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class FacesMessages implements Serializable {

	private static final long serialVersionUID = -1410650582122396625L;
	
	private void add(String mensagem, Severity severity) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage(mensagem);
		msg.setSeverity(severity);
		
		context.addMessage(null, msg);
		
	}
	
	public void info(String mensagem) {
		add(mensagem, FacesMessage.SEVERITY_INFO);
	}

	public void error(String mensagem) {
		add(mensagem, FacesMessage.SEVERITY_ERROR);
	}
}
