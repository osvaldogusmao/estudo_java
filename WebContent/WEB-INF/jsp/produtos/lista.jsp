<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<thead>
		<th>Produto</th>
		<th>Descri��o</th>
		<th>Pre�o</th>
		<th>A��es</th>
	</thead>
	<tbody>
		<c:forEach items="${produtoList }" var="produto">
			<tr>
				<td>${produto.nome }</td>
				<td>${produto.descricao }</td>
				<td>${produto.preco }</td>
				<td><a href="edita?id=${produto.id }">Editar</a> | 
				<a href="remove?id=${produto.id }">Excluir</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>