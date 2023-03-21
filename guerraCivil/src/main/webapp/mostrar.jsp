
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="navesAlianza.*" %>
<%
    String tipo = (String)session.getAttribute("tipo");
    int numPasaj = (int)session.getAttribute("numPasajeros");
    double consumoNav = (double)session.getAttribute("consumoNav");
    int numNaves = (int)session.getAttribute("numNaves");
    
    
    double consumoTot = (double)session.getAttribute("consumoTot");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2> Tipo de Nave: <%= tipo %>  </h2>
        <h2> El numero de pasajeros: <%= numPasaj %> </h2>
        <h2> El consumo por parcec es: <%= consumoNav %> </h2>
        <h2> Numero de naves: <%= numNaves %> </h2 
        <h2> Consumo total de guerra: <%= consumoTot %> </h2>
    </body>
</html>





