<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%-- Establece la pagina de error que se invocara al lanzarse la excepcion ---%>
<%@page errorPage="/excepciones/captura-excepcion1.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <h1>JSP Page</h1>
    
    <%
    
        // Declara la variable 'x' y la inicializa con null
        String x = null;
                
        // Intenta utilizar un metodo de 'x' que como es null lanza una NullPointerException
        x.concat("Hola!");
    
    %>
    
    </body>
</html>
