<form id="usuariosForm" method="POST" action="<c:url value="/usuarios"/>">
	<fieldset>
		<legend>Novo usuário</legend>

		<label for="nome">Nome:</label> 
		<input type="text" id="nome" name="usuario.nome" value="${usuario.nome }" /> 
		
		<label for="login">Login:</label>
		<input type="text" id="login" name="usuario.login"	value="${usuario.login }" /> 
		
		<label for="senha">Senha:</label> 
		<input type="password" id="senha" name="usuario.senha" value="${usuario.senha }" /> 
		
		<label for="confirmacao">Confirme a senha:</label> 
		<input type="password" id="confirmacao" name="confirmacao" />

		<button type="submit">Cadastrar</button>

	</fieldset>
</form>

<script type="text/javascript">
	
	$('#usuariosForm').validate({
		rules : {
			"usuario.nome" : {
				required: true,
				minlength: 5
			},
			"usuario.login":{
				required: true,
				minlength: 6
			},
			"usuario.senha":{
				required: true
			},
			"confirmacao":{
				equalTo: "#senha"
			}
		}		
	});
	
</script>