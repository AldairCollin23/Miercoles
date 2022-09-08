<%-- 
    Document   : EliminarCliente
    Created on : 07/09/2022, 08:17:59 PM
    Author     : ILP
--%>
<%
 String dni=request.getParameter("dni");
%>
<jsp:useBean id="co" scope="page" class="controlador.Control" />
<% 
int d=co.eliminarCliente(dni);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if(d==1){%>
        <h1>SE ELIMINO CORRECTAMENTE</h1>
        <h1
       <% }else{%>
       <h1>ERROR NO SE PUDO ELIMINAR</h1>
       <% } %>
    </body>
</html>
