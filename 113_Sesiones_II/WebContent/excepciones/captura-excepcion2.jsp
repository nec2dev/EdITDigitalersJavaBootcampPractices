<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%-- Establece esta pagina como pagina de error, y "nace" de esta forma el objeto implicito 'exception' ---%>
<%@page isErrorPage="true" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <h1>Captura de Excepciones via contenedor!</h1>
    
    <%
        out.println("<B>Excepcion: </B>" + exception + "<HR>");
        out.println("<B>Mensaje de Excepcion: </B>" + exception.getMessage());
    %>
    
    <HR>
    
    <B>NOTA: </B>Chequear el archivo web.xml y ver como esta configurada la captura de la excepcion
    
    </body>
</html>
