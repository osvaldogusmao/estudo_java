package br.com.caelum.goodbuy;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;

//Teste
/**
 * 
 * Classe Mundo.java
 * Apenas para teste - Osvaldo Gusm‹o
 * 
 * */

@Resource
public class Mundo {

	public String boasVindas() {
		return "Ol‡ mundo!!!";
	}

	public List<String> paises() {
		List<String> paises = new ArrayList<String>();
		paises.add("Brasil");
		paises.add("Canada");
		paises.add("Africa");
		paises.add("Londres");

		return paises;
	}

	public Produto mostra() {
		Produto produto = new Produto();
		produto.setNome("Produto Nome");
		produto.setPreco(15.50);

		return produto;

	}
}
