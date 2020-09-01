package br.unifacol.loja.mvc.view;

import br.unifacol.loja.mvc.controller.PessoaController;
import br.unifacol.loja.mvc.model.PessoaServico;

public class Main {
	public static void main(String[]args) {
		PessoaController  pc=new PessoaController();
		pc.listarPessoa("56456465");
	}
}
