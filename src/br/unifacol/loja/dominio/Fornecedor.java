package br.unifacol.loja.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Fornecedor {
	public String nomeFantasia;
	public String razaoSocial;
	public String cnpj;
	public Date dataUltimaCompra;	 
	public boolean situacao;
	public ArrayList<ProdutoFornecedor> produtosFornecidos;
	public String enderecoRua;
	public String ederecoBairro;
	public String enderecoCep;
	public String enderecoNumero;
	public String enderecoComplemento;
	public String telefone;
	public String email;
	public String whatapp;
	 
}
