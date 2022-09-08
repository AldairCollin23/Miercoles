<%-- 
    Document   : RegistrarCliente
    Created on : 07/09/2022, 06:45:30 PM
    Author     : ILP
--%>
<%
 String dni=request.getParameter("dni");
 String nom=request.getParameter("nom");
 String apepat=request.getParameter("apepat");
 String apemat=request.getParameter("apemat");
%>

<jsp:useBean id="co" scope="page" class="controlador.Control" />
<% 
int c=co.regCliente(dni, nom, apepat,apemat);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <%if(c==1){%>
        <h1>SE REGISTRO CORRECTAMENTE</h1>
        <h1
       <% }else{%>
       <h1>ERROR NO PUDO REGISTRARSE</h1>
       <% } %>
    </body>
</html>
