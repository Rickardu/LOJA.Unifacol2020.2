package br.unifacol.loja;

import java.util.Date;

public class Vendedor  extends Pessoa{
	 
	private String matricula;
	private Date dataAdmissao;
	private Date dataDelisgamento;
	private boolean situacao;
	private float metaVendas;
	private float VendasAnterior;
	private float VendasAtual;
	private int qtdClientesAtendidos;
	private String enderecoLojaRua;
	private String ederecoLojaBairro;
	private String enderecoLojaCep;
	private String enderecoLojaNumero;
	private String enderecoLojaComplemento;
	private String telefone;
	private String email;
	private String whatapp;
	private String nomeLoja;
	
	
	
	public Vendedor(String nome, Date dataNascimento, String enderecoRua, String ederecoBairro, String enderecoCep,
			String enderecoNumero, String enderecoComplemento, String telefone, String email, String whatapp,
			String matricula, Date dataAdmissao, Date dataDelisgamento, boolean situacao, float metaVendas,
			float vendasAnterior, float vendasAtual, int qtdClientesAtendidos, String enderecoLojaRua,
			String ederecoLojaBairro, String enderecoLojaCep, String enderecoLojaNumero, String enderecoLojaComplemento,
			String telefone2, String email2, String whatapp2, String nomeLoja) {
		super(nome, dataNascimento, enderecoRua, ederecoBairro, enderecoCep, enderecoNumero, enderecoComplemento,
				telefone, email, whatapp);
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.dataDelisgamento = dataDelisgamento;
		this.situacao = situacao;
		this.metaVendas = metaVendas;
		VendasAnterior = vendasAnterior;
		VendasAtual = vendasAtual;
		this.qtdClientesAtendidos = qtdClientesAtendidos;
		this.enderecoLojaRua = enderecoLojaRua;
		this.ederecoLojaBairro = ederecoLojaBairro;
		this.enderecoLojaCep = enderecoLojaCep;
		this.enderecoLojaNumero = enderecoLojaNumero;
		this.enderecoLojaComplemento = enderecoLojaComplemento;
		telefone = telefone2;
		email = email2;
		whatapp = whatapp2;
		this.nomeLoja = nomeLoja;
	}
	
	
	
	public Vendedor(String nome, Date dataNascimento, String enderecoRua, String ederecoBairro, String enderecoCep,
			String enderecoNumero, String enderecoComplemento, String telefone, String email, String whatapp) {
		super(nome, dataNascimento, enderecoRua, ederecoBairro, enderecoCep, enderecoNumero, enderecoComplemento,
				telefone, email, whatapp);
	}



	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataDelisgamento() {
		return dataDelisgamento;
	}
	public void setDataDelisgamento(Date dataDelisgamento) {
		this.dataDelisgamento = dataDelisgamento;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public float getMetaVendas() {
		return metaVendas;
	}
	public void setMetaVendas(float metaVendas) {
		this.metaVendas = metaVendas;
	}
	public float getVendasAnterior() {
		return VendasAnterior;
	}
	public void setVendasAnterior(float vendasAnterior) {
		VendasAnterior = vendasAnterior;
	}
	public float getVendasAtual() {
		return VendasAtual;
	}
	public void setVendasAtual(float vendasAtual) {
		VendasAtual = vendasAtual;
	}
	public int getQtdClientesAtendidos() {
		return qtdClientesAtendidos;
	}
	public void setQtdClientesAtendidos(int qtdClientesAtendidos) {
		this.qtdClientesAtendidos = qtdClientesAtendidos;
	}
	public String getEnderecoLojaRua() {
		return enderecoLojaRua;
	}
	public void setEnderecoLojaRua(String enderecoLojaRua) {
		this.enderecoLojaRua = enderecoLojaRua;
	}
	public String getEderecoLojaBairro() {
		return ederecoLojaBairro;
	}
	public void setEderecoLojaBairro(String ederecoLojaBairro) {
		this.ederecoLojaBairro = ederecoLojaBairro;
	}
	public String getEnderecoLojaCep() {
		return enderecoLojaCep;
	}
	public void setEnderecoLojaCep(String enderecoLojaCep) {
		this.enderecoLojaCep = enderecoLojaCep;
	}
	public String getEnderecoLojaNumero() {
		return enderecoLojaNumero;
	}
	public void setEnderecoLojaNumero(String enderecoLojaNumero) {
		this.enderecoLojaNumero = enderecoLojaNumero;
	}
	public String getEnderecoLojaComplemento() {
		return enderecoLojaComplemento;
	}
	public void setEnderecoLojaComplemento(String enderecoLojaComplemento) {
		this.enderecoLojaComplemento = enderecoLojaComplemento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setTelefone(String telefone, String ddd) {
		this.telefone = ddd+"-"+telefone;
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
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	
	
}
