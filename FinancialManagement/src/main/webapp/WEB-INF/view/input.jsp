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
	<form action="save" method="post">
		<h3>Adicionar entradas</h3>
		<label>Nome:</label>
		<input  id="name" name="${input.name}">
		<label>Valor:</label>
		<input  id="value" name="value" type="number">
		<input type="submit" value="Adicionar Entrada">
	</form>
</body>
</html>