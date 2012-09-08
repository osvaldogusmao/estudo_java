package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import static br.com.caelum.vraptor.view.Results.*;

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

	@Get("/produtos")
	public List<Produto> lista() {
		return dao.listaTudo();
	}

	@Post("/produtos")
	public void adiciona(Produto produto) {
		validaFormulario(produto);
		dao.salva(produto);
		result.redirectTo(this).lista();
	}

	@Get("/produtos/novo")
	public void formulario() {

	}

	@Get("/produtos/{id}")
	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	@Put("/produtos/{produto.id}")
	public void altera(Produto produto) {
		validaFormulario(produto);
		dao.altera(produto);
		result.redirectTo(this).lista();
	}

	@Delete("/produtos/{id}")
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}

	public List<Produto> busca(String nome) {
		result.include("nome", nome);
		return dao.busca(nome);
	}

	@Get("/produtos/busca.json")
	public void buscaJson(String q) {
		result.use(json()).withoutRoot().from(dao.busca(q))
				.exclude("id", "descricao").serialize();
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
