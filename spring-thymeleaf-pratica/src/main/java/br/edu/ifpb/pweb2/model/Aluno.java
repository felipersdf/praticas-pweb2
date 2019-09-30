package br.edu.ifpb.pweb2.model;

public class Aluno {
	private Long id;
	private String nome;
	private Long matricula;
	private String login;
	private String pais;
	private String linguagem;
	
//	Constructors
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno() {}
	
//  Gets and Setters;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
}
