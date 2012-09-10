<form action="<c:url value="/login"/>" method="POST">
	<fieldset>
		<legend>Identificação</legend>
	
		<label for="login">Login:</label>
		<input type="text" id="login" name="usuario.login"/>
		
		<label for="senha">Senha:</label>
		<input type="password" id="senha" name="usuario.senha">
		
		<button type="submit">Entrar</button>
			
	</fieldset>
</form>