<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<thead>
		<th>Produto</th>
		<th>Descrição</th>
		<th>Preço</th>
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