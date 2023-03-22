
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="navesAlianza.*" %>
<%
    
    
    double consumoTot = (double)session.getAttribute("consumoTot");
    

    HalconMilenario nave1 = (HalconMilenario)session.getAttribute("halcon");
    double comb1 = (double)session.getAttribute("halcon_consumo");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>HALCON MILENARIO</h2>
        <h2> Tipo de Nave: <%= nave1.getTipo() %>  </h2>
        <h2> El numero de pasajeros:  <%= nave1.getNumPasajeros() %></h2>
        <h2> El consumo por parcec es: <%= nave1.getCombustibleParsec() %> </h2>
        <h2> Numero de naves: <%= nave1.getNumNaves() %> </h2 
        <h2> Consumo total de guerra: <%= comb1 %> </h2>
    </body>
</html>





