<%-- 
    Document   : Vista
    Created on : 06-sep-2022, 17:43:14
    Author     : ILP
--%>

<%
 String cod=request.getParameter("cod");
 String nom=request.getParameter("nom");
 String marca=request.getParameter("marca");
%>
<jsp:useBean id="co" scope="page" class="controlador.Control" />
<% 
int h=co.regProd(cod, nom, marca);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%if(h==1){%>
        <h1>SE REGISTRO CORRECTAMENTE</h1>
        <h1
       <% }else{%>
       <h1>ERROR NO PUDO REGISTRARSE</h1>
       <% } %>
        
    </body>
</html>
