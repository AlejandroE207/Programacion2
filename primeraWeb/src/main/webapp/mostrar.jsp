<%-- 
    Document   : mostrar
    Created on : 26/02/2023, 12:28:38 p. m.
    Author     : User
--%>

<% 
            String nombre= request.getParameter("nombre");
            String telefono= request.getParameter("telefono");
            String ciudad= request.getParameter("ciudad");
            String correo= request.getParameter("correo");    
        %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloForm.css">
    <title>BIENVENID@</title>
</head>
<body>
    <h1 class="titulo1">BIENVENID@</h1>
    <div class="info">
        <div class="contenedor_info">
            <div class="contenedor_campos">
                <div class="campo">
                    <h2 class="campo_label">Nombre:</h2>
                    <p class="campo_info"><%= nombre %></p>
                </div>
                <div class="campo">
                    <h2 class="campo_label">Telefono:</h2>
                    <p class="campo_info"><%= telefono %></p>
                </div>
                <div class="campo">
                    <h2 class="campo_label">Ciudad:</h2>
                    <p class="campo_info"><%= ciudad %></p>
                </div>
                <div class="campo">
                    <h2 class="campo_label">Correo:</h2>
                    <p class="campo_info"><%= correo %></p>
                </div>
            </div>
        </div>
    </div>
                
    <%
        String msg = (String)session.getAttribute("servletMsg");
    %>
    <h2><%= msg %></h2>
</body>
</html>
