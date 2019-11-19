package br.edu.ifpb.pweb2.bean;


import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import br.edu.ifpb.pweb2.model.EstadoCivilEnum;

@Named(value="bbean")
@RequestScoped
public class MeuBackingBean {
	
	private String mensagem = "Produzindo um Bean";
	private String nome, faixa, senha, nomeCidade;
	private Integer idade, cidade;
	private String[] cidades = {"João Pessoa", "Campina Grande", "Taperoá", "Soledade", "Juazeirinho"};
	private EstadoCivilEnum estCivil;

	public String maiusculas() {
		this.nome = this.getNome().toUpperCase();
		return null;
	}
	
	public String minusculas() {
		this.nome = this.nome.toLowerCase();
		return null;
	}
	
	public String calculaFaixa() {
		
		if(idade > 18 && idade <= 25) 
			faixa = "[Jovem]";
		else if (idade > 25 && idade <= 59) 
			faixa = "[Adulto]";
		else if(idade > 59 && idade <= 90) 
			faixa = "[Idoso]";
		
		return null;
	}
	
	public String valideSenha() {
		FacesContext fc = FacesContext.getCurrentInstance();
		String msg = "Senha não confere!";
		FacesMessage.Severity nivel = FacesMessage.SEVERITY_ERROR;
		if(this.senha.equalsIgnoreCase("secret")) {
			msg = "Senha confere!";
			nivel = FacesMessage.SEVERITY_INFO;
		}
		FacesMessage facesMsg = new FacesMessage(nivel, msg, null);
		fc.addMessage("form4:senha", facesMsg);
		return null;
	}
	
	public void selecioneCidade(ActionEvent e) {
		if (cidade != null) {
			this.nomeCidade = cidades[cidade];
		}
	}

	public EstadoCivilEnum[] getEstadosCivis() {
		return EstadoCivilEnum.values();
	}
	
	public void selecioneEstCivil(ActionEvent e) {
		
	}
	
	public void executeMudancaEstCviil(AjaxBehaviorEvent abe) {
		System.out.println("Processou ajax na fase: "+ abe.getPhaseId()
						   +" gerador por"
						   + ((UIComponent) abe.getSource()).getClientId()  );
	}
	
	public Map<String, String> criaEstados(){
		LinkedHashMap<String, String> estados = new LinkedHashMap<String, String>();
		estados.put("AC", "Acre");
		estados.put("AL","Alagoas");
		estados.put("AP","Amapá");
		estados.put("AM","Amazonas");
		estados.put("BA","Bahia");
		estados.put("CE","Ceará");
		estados.put("DF","Distrito Federal");
		estados.put("ES","Espírito Santo");
		estados.put("GO","Goiás");
		estados.put("MA","Maranhão");
		estados.put("MT","Mato Grosso");
		estados.put("MS","Mato Grosso do Sul");
		estados.put("MG","Minas Gerais");
		estados.put("PA","Pará");
		estados.put("PB","Paraíba");
		estados.put("PR","Paraná");
		estados.put("PE","Pernambuco");
		estados.put("PI","Piauí");
		estados.put("RJ","Rio de Janeiro");
		estados.put("RN","Rio Grande do Norte");
		estados.put("RS","Rio Grande do Sul");
		estados.put("RO","Rondônia");
		estados.put("RR","Roraima");
		estados.put("SC","Santa Catarina");
		estados.put("SP","São Paulo");
		estados.put("SE","Sergipe");
		estados.put("TO","Tocantins");
		
		return estados;
	}
	
	
//	Getters and Setters

	public String getFaixa() {
		return faixa;
	}

	public EstadoCivilEnum getEstCivil() {
		return estCivil;
	}

	public void setEstCivil(EstadoCivilEnum estCivil) {
		this.estCivil = estCivil;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Integer getCidade() {
		return cidade;
	}

	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
