<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="receber.jsp">

<label>CPF:</label>
<input type="text" name="CPF">
<br>

<label>telefone:</label>
<input type="text" name="telefone">
<br>
<label>Nome cliente:</label>
<input type="text" name="nome_cli">
<br>

<label>Email:</label>
<input type="text" name="email">
<br>



<input type="submit">
</form>
</body>
</html>