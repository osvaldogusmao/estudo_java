
<form id="produtosForm" action="<c:url value="/produtos"/>" method="post">
	<fieldset>
		<legend>Adicionar Produto</legend>

		<div id="erros">
			<ul>
				<c:forEach items="${errors}" var="error">
					<li>${error.category} - ${error.message}</li>
				</c:forEach>
			</ul>
		</div>


		<label for="nome">Nome:</label> 
		<input type="text" id="nome" name="produto.nome" value="${produto.nome }"> 
		<label for="descricao">Descrição:</label>
		<textarea rows="8" cols="80" name="produto.descricao" id="descricao">${produto.descricao }</textarea>

		<label for="preco">Preço:</label> 
		<input type="text" id="preco" name="produto.preco" value="${produto.preco}"> <br />

		<button type="submit">Cadastrar</button>
	</fieldset>
</form>

<script type="text/javascript">

$('#produtosForm').validate({
	rules: {
		"produto.nome": {
			required: true,
			minlength: 3
		},
		"produto.descricao":{
			required: true,
			maxlength: 40
		},
		"produto.preco":{
			required: true,
			min: 0.0
		}
	}
});
</script>