<form action="adiciona" method="post">
	<fieldset>
		<legend>Adicionar Produto</legend>

		<label for="nome">Nome:</label> <input type="text" id="nome"
			name="produto.nome"> <label for="descricao">Descri��o:</label>
		<textarea rows="8" cols="80" name="produto.descricao" id="descricao"></textarea>

		<label for="preco">Pre�o:</label> <input type="text" id="preco"
			name="produto.preco"> <br />
		<button type="submit">Cadastrar</button>
	</fieldset>
</form>