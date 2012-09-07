package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutosController {

	private ProdutoDao dao;
	private Result result;

	public ProdutosController(ProdutoDao dao, Result result) {
		this.dao = dao;
		this.result = result;
	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	public void adiciona(Produto produto) {
		dao.salva(produto);
		result.redirectTo(this).lista();
	}

	public void formulario() {

	}

	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	public void altera(Produto produto) {
		dao.altera(produto);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
