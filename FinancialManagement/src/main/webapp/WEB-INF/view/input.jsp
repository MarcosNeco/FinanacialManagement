<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Salvar entrada</title>
</head>
<body>
	<spring:form action="input/save" method="post" modelAttribute="input">
		<h3>Adicionar entradas</h3>
		<label>Nome:</label>
		<spring:input path="name"></spring:input>
		<label>Valor:</label>
<%-- 		<spring:select path="inputType"> --%>
<%-- 			<spring:options items="${inputTypes}"/> --%>
<%-- 		</spring:select> --%>
		<input type="submit" value="Adicionar Entrada">
	</spring:form>
</body>
</html>