package br.unifacol.loja.mvc.model;

import br.unifacol.loja.mvc.dominio.Pessoa;

public interface IPessoaServico {
	public Pessoa listarPessoa(String cpf);
}
