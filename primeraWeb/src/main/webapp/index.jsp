<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estiloForm.css">
    <title>FORMULARIO JSP</title>
</head>
<body>
    
    <h1 class="titulo1">INSCRIPCIÓN</h1>
    <div class="contenedor_formulario">
        <form action="mostrar.jsp" method="post" class="formulario">
            <fieldset class="formulario_fieldset">
                <legend>
                    FORMULARIO DE REGISTRO
                </legend>
                <div class="formulario_contenedor_campos">
                    <div class="campo">
                        <label for="nombre" class="campo_label">Nombre</label>
                        <input type="text" class="campo_field" placeholder="Tu nombre" name="nombre">
                    </div>
                    <div class="campo">
                        <label for="telefono" class="campo_label">Telefono</label>
                        <input type="number" class="campo_field" placeholder="Tu numero telefonico" name="telefono">
                    </div>
                    <div class="campo">
                        <label for="ciudad" class="campo_label">Ciudad</label>
                        <input type="text" class="campo_field" placeholder="Ciudad donde vives" name="ciudad">
                    </div>
                    <div class="campo">
                        <label for="correo" class="campo_label">Correo</label>
                        <input type="email" class="campo_field" placeholder="alguien@algo.com" name="correo">
                    </div>
                    <div class="campo">
                        <label for="contraseña" class="campo_label">Contraseña</label>
                        <input type="password" class="campo_field" placeholder="Ingresa una contraseña" name="contraseña" required="">
                    </div>
                </div> 
                <div class="flex alinear-centro">
                    <input type="submit" class="boton enviar w-sm-100" value="Enviar" id="btn_enviar">
                </div>
                
            </fieldset>
        </form>
    
    
    </div>
    
    
    
</body>
</html>