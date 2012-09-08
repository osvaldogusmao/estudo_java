<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<thead>
		<th>Produto</th>
		<th>Descri��o</th>
		<th>Pre�o</th>
		<th>Comprar</th>
		<th>A��es</th>
	</thead>
	<tbody>
		<c:forEach items="${produtoList }" var="produto">
			<tr>
				<td>${produto.nome }</td>
				<td>${produto.descricao }</td>
				<td>${produto.preco }</td>
				<td>
					<form action="<c:url value="/carrinho"/>" method="POST">
						<input type="hidden" name="item.produto.id" value="${produto.id}"/>
						<input class="qtde" name="item.quantidade" value="1"/>
						<button type="submit">Comprar</button>
					</form>
				</td>
				<td><a href="<c:url value="/produtos/${produto.id }"/>">Editar</a>
					|
					<form action="<c:url value="/produtos/${produto.id }"/>"
						method="POST">
						<button class="link" name="_method" value="DELETE">Remover</button>
					</form></td>
			</tr>
		</c:forEach>
	</tbody>
</table>