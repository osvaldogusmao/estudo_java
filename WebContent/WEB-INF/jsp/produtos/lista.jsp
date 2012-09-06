<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<thead>
		<th>Produto</th>
		<th>Descri��o</th>
		<th>Pre�o</th>
	</thead>
	<tbody>
		<c:forEach items="${produtoList }" var="produto">
			<tr>
				<td>${produto.nome }</td>
				<td>${produto.descricao }</td>
				<td>${produto.preco }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>