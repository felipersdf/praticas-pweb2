<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" charset="ISO-8859-1">
<title>Formul�rio de Cadastro de Aluno</title>
</head>
<body>

<form:form action="salve" method="post" modelAttribute="aluno">
	
	Nome:<form:input path="nome"/><form:errors path="nome"/><br/><br/>
	
	Matr�cula:<form:input path="matricula"/><form:errors path="matricula"/><br/><br/>
	
	Data:<form:input path="dataNascimento"/><form:errors path="dataNascimento"/><br/><br/>
	
	C�digo do Curso:<form:input path="curso"/><form:errors path="curso"/><br/><br/>
	
	CRE:<form:input path="cre"/><form:errors path="cre"/><br/><br/>

<input type="submit" value="Salvar"/>
</form:form>
</body>
</html>