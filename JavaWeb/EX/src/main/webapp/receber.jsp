<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  String nome = request.getParameter("nome");
  int idade = Integer.parseInt(request.getParameter("idade"));
  out.print("Sua idade é: "+idade);
  out.print("<br>");
  out.print("seu nome é: "+nome);
  out.print("<br>");
  if(idade >= 18){
	  out.print("Você é de maior");
  }else{
	  out.print("Você é de menor");
  }
  %>
</body>
</html>