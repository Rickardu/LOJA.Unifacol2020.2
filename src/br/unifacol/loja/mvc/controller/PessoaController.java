package br.unifacol.loja.mvc.controller;

import br.unifacol.loja.mvc.dominio.Pessoa;
import br.unifacol.loja.mvc.model.PessoaServico;

public class PessoaController {
	public static  Pessoa listarPessoa(String cpf) {
		
		PessoaServico  ps=new PessoaServico();
		return ps.listarPessoa(cpf);
		 
		
	}

}
