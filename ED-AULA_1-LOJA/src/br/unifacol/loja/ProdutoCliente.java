package br.unifacol.loja;

import java.util.ArrayList;

public class ProdutoCliente {
	public String nome;
	public String descricao;
	public String descontoAvista;
	public String descontoWeb;
	public String descontoCompraCasada;
	public ArrayList<ProdutoCliente> ProdutosCompraCasada;
	public int prazoEntrega;
	public double precoVenda;
	public Vendedor atendimento;

}
