package br.edu.ifpb.pweb2.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="loginBean")
@RequestScoped
public class LoginBean {

	
	private String login, senha;

	
	public String autentique() {
		if(login.equals("admin") && senha.equals("changeit")) {
			return "sucesso?faces-redirect=true";
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Usuário e/ou senha inválidos.",
						"Verifique se a CAPSLOCK está ativada."));
//		facesContext.addMessage(null, 
//				new FacesMessage(FacesMessage.SEVERITY_ERROR,
//						"Usuário e/ou senha incorretos.",
//						"O usuário e/ou  precisam conter no mínimo 5 caracteres e no máximo 10"));
		return null; //Volta para a página onde está
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
