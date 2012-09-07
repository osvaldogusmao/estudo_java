package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;

@Resource
public class ProdutosController {

	private final ProdutoDao dao;
	private final Result result;
	private final Validator validator;

	public ProdutosController(ProdutoDao dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	public void adiciona(Produto produto) {
		validaFormulario(produto);
		dao.salva(produto);
		result.redirectTo(this).lista();
	}

	public void formulario() {

	}

	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	public void altera(Produto produto) {
		validaFormulario(produto);
		dao.altera(produto);
		result.redirectTo(this).lista();
	}

	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}

	private void validaFormulario(final Produto produto) {
		validator.checking(new Validations() {
			{
				that(produto.getNome() != null
						&& produto.getNome().length() >= 3, "Nome",
						"nome.obrigatorio");
				that(produto.getDescricao() != null
						&& produto.getNome().length() <= 40, "Descrição",
						"descricao.obrigatoria");
				that(produto.getPreco() != null && produto.getPreco() > 0.0,
						"Preço", "preco.obrigatorio");
			}
		});
		validator.onErrorUsePageOf(ProdutosController.class).formulario();

	}

}
