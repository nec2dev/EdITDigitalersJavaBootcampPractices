<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="ar.com.educacionit.webprogramming.sessions.Persona" %>

<%

// Destruye la sesion
session.invalidate();

%>

    <h1>destruir-sesion.jsp</h1>
    <HR>

<I> La sesion ha sido destruida </I>
<P>
<a href="index.jsp">Volver</a>

