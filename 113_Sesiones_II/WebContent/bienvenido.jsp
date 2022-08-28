<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="ar.com.educacionit.webprogramming.sessions.Persona" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <h1>bienvenido.jsp</h1>
    <HR>
    
    <a href="index.jsp">Ir a index.jsp</a> | 
    <a href="bienvenido.jsp">Ir a bienvenido.jsp</a> | 
    <a href="chau.jsp">Ir a chau.jsp</a>
    <HR>
    <P>
    <P>    

    <B>DATOS EN SESION:</B><BR>
    <%
        // Construye variables
        String nombre = "<font color=red>VACIO</font>";
        String apellido = "<font color=red>VACIO</font>";
        
        // Obtiene los datos guardados en sesion si es que los hay
        Persona p = (Persona) session.getAttribute("persona");
        
        // Chequea los datos de la sesion
        if(p!= null){
            nombre = "<font color=green>" + p.getNombre() + "</font>";
            apellido = "<font color=green>" + p.getApellido() + "</font>";
        }
    %>
    Nombre: <%=nombre%><BR>
    Apellido: <%=apellido%><BR>
    sessionID: <%=session.getId()%><BR>
    <BR>
    
    </body>
</html>
