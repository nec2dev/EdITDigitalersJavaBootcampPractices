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

    <h1>Captura del error HTTP 404</h1>
    <HR>
    <I>Disculpe, la pagina no ha sido encontrada</I>
    <BR>
    <BR>
    <B>NOTA: </B>Chequear el archivo web.xml y ver como esta configurada la captura del error

    </body>
</html>
