<%-- 
    Document   : RegistrarProducto
    Created on : 07/09/2022, 07:10:15 PM
    Author     : ILP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="Vista.jsp">
            <label for="">codigo</label>
            <input type="text" name="cod">
            <label for="">nombre</label>
            <input type="text" name="nom">
            <label for="">marca</label>
            <input type="text" name="marca">
            <button type="submit">Registrar</button>
        </form>

    </body>
</html>
