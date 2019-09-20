<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Conten-Type" content="text/html; charset=UTF-8">
<title>Página Principal da Aplicação</title>
</head>
<body>

	<h1>Livros Cadastrados</h1>
	<hr/>
	
	<c:if test="${not empty livro}">
	<p>${livro.titulo} cadastrado com sucesso!</p>
	</c:if>


	<table>
		<tr>
			<th>Id</th>
			<th>Título</th>
			<th>Autor</th>
		</tr>
			<c:forEach var="livroItem" items="${livros}">
		<tr style="text-align: center">
			<td><a href="http://localhost:8080/spring-pratica-mvc-1/livros/${livroItem.id}">${livroItem.id}</td></a>
			<td>${livroItem.titulo}</td>
			<td>${livroItem.autor}</td>
		</tr>
		     </c:forEach>
	</table>
	
</body>
</html>