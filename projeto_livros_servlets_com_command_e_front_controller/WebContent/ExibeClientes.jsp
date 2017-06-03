<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="br.com.bossini.model.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Exibindo lista de clientes</title>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<th>identificador</th>
					<th>nome</th>
					<th>fone</th>
					<th>email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${clientes}" var="cliente">
					<tr>
						<td>${cliente.id}</td>
						<td>${cliente.nome}</td>
						<td>${cliente.telefone}</td>
						<td>${cliente.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>