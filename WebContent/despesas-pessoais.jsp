
<%@ page import="br.com.impacta.javaweb.despesas.dao.*,br.com.impacta.javaweb.despesas.model.*, java.util.*"%>
<%@ taglib prefix = "c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt"   uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Listagem de Despesas Pessoais</title>
</head>
<body>
	<div class="card">
		<div class="card-title">Despesas Pessoais</div>
		<div class="card-text">
			Listagem das últimas despesas pessoais registradas:
		</div> 
		<table class="table">
			<thead>
				<tr>
					<th>Descrição</th>
					<th>Categoria</th>
					<th>Data</th>
					<th>Valor</th>
					<th>Observações</th>
				</tr>
			</thead>
			<tbody>
				<%
					DAODespesa dao = new DAODespesa();
					session.setAttribute("despesas", dao.getDespesas());			
				%>
 				<c:forEach items = "${despesa}" var = "despesa" >
 				  <tr>
 				  		<td>${despesa.descricao}</td>
 				  		<td>${despesa.categoria}</td>
 				  		<td>${despesa.data}</td>
 				  		<td><fmt:formatNumber value="$[despesa.valor]" type="currency"/></td>
 				  		<td>${(despesa.observacoes != null) ? despesa.observacoes : "" }</td>
		  
 				  </tr>
 			
 				</c:forEach>
 							
					<tr>
						<td>[descricao]</td>
						<td>[categoria]</td>
						<td>[data]</td>
						<td>[valor]</td>
						<td>[observacoes]</td>
					</tr>
			</tbody>
		</table>	
	</div>
</body>
</html>