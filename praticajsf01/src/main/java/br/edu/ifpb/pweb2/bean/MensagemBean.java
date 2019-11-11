package br.edu.ifpb.pweb2.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="msgBean")
@RequestScoped
public class MensagemBean {
	
	private String mensagem = "Bem vindo ao JSF";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}
