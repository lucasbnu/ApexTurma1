<%@page import="DAO.geralDAO"%>
<%@page import="DTO.clientesDTO"%>
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
   geralDAO DAO = new geralDAO();
   clientesDTO cliDTO = new clientesDTO();
   String CPF = request.getParameter("CPF");
   String telefone = request.getParameter("telefone");
   String nome_cli = request.getParameter("nome_cli");
   String email = request.getParameter("email");  
   
   cliDTO.setCPF(CPF);
   cliDTO.setEmail(email);
   cliDTO.setNome_Cliente(nome_cli);
   cliDTO.setTelefone(telefone);
   DAO.insereRegistro(cliDTO);
  %>
</body>
</html>