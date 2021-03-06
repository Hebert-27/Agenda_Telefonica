package br.com.hebertnunes.model;

public class Contato {
	
	private int id;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String celular;
	private String email;
	
	public Contato(String nome, String sobrenome, String telefone, String celular, String email) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
