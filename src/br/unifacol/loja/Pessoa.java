package br.unifacol.loja;

import java.util.Date;

public abstract class Pessoa {
	protected String nome; 
	protected Date dataNascimento;	 
	protected String enderecoRua;
	protected String ederecoBairro;
	protected String enderecoCep;
	protected String enderecoNumero;
	protected String enderecoComplemento;
	protected String telefone;
	protected String email;
	protected String whatapp;
	
	
	
	public Pessoa(String nome, Date dataNascimento, String enderecoRua, String ederecoBairro, String enderecoCep,
			String enderecoNumero, String enderecoComplemento, String telefone, String email, String whatapp) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.enderecoRua = enderecoRua;
		this.ederecoBairro = ederecoBairro;
		this.enderecoCep = enderecoCep;
		this.enderecoNumero = enderecoNumero;
		this.enderecoComplemento = enderecoComplemento;
		this.telefone = telefone;
		this.email = email;
		this.whatapp = whatapp;
	}
	public Pessoa(String nome, Date dataNascimento ) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		 
	}
	
	/*public Pessoa() {
		super();
	}*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEnderecoRua() {
		return enderecoRua;
	}
	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}
	public String getEderecoBairro() {
		return ederecoBairro;
	}
	public void setEderecoBairro(String ederecoBairro) {
		this.ederecoBairro = ederecoBairro;
	}
	public String getEnderecoCep() {
		return enderecoCep;
	}
	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}
	public String getEnderecoNumero() {
		return enderecoNumero;
	}
	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}
	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}
	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWhatapp() {
		return whatapp;
	}
	public void setWhatapp(String whatapp) {
		this.whatapp = whatapp;
	} 
	
	
}
