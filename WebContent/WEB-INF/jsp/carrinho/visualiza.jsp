<h3>Itens do seu carrinho de compras</h3>
<table>
	<thead>
		<tr>
			<th>Ação</th>
			<th>Nome</th>
			<th>Descrição</th>
			<th>Preço</th>
			<th>Qtde</th>
			<th>Total</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${carrinho.itens}" var="item" varStatus="s">
			<tr>
				<td>
					<form action="<c:url value="/carrinho/${s.index}"/>" method="POST">
						<button class="link" name="_method" value="DELETE">Remover</button>						
					</form>
				</td>
				<td>${item.produto.nome }</td>
				<td>${item.produto.descricao }</td>
				<td>${item.produto.preco }</td>
				<td>${item.quantidade }</td>
				<td><fmt:formatNumber type="currency"
						value="${item.quantidade * item.produto.preco }" /></td>
			</tr>
		</c:forEach>
	</tbody>
	<tfoot>
		<td colspan="3"></td>
		<td colspan="2">Total:</td>
		<th><fmt:formatNumber type="currency" value="${carrinho.total }" />
		</th>
	</tfoot>
</table>