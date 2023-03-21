<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilo.css">
    <title>Document</title>
</head>
<body>
    <h1 class="titulo1">CALCULO DE COMBUSTIBLE</h1>
    <div class="contenedor_formulario">
        <form action="miServlet" method="post" class="formulario">
            <fieldset class="formulario_fieldset">
                <legend>
                    STAR WARS
                </legend>
                <div class="formulario_contenedor_campos">
                    <div class="campo">
                        <label for="tipo" class="campo_label">Tipo de Nave</label>
                        <select name="tipo" class="campo_field">
                            <option value="">Selecciona un tipo</option>
                            <option value="HalconMilenario">Halc�n Milenario</option>
                            <option value="DestructorEstelar">Destructor Estelar</option>
                            <option value="LanzaderaImperial">Lanzadera Imperial</option>
                            <option value="Supremacy">Supremacy</option>
                            <option value="AtAt">At-At</option>
                        </select>
                    </div>
                    <div class="campo">
                        <label for="numPasajeros" class="campo_label">Cantidad de pasajeros</label>
                        <input type="int" class="campo_field" placeholder="Cantidad de pasajeros" name="numPasajeros">
                    </div>
                    <div class="campo">
                        <label for="consumoCombustible" class="campo_label">Consumo de Combustible</label>
                        <input type="double" class="campo_field" placeholder="Cantidad de combustible por parsec" name="consumoCombustible">
                    </div>
                    <div class="campo">
                        <label for="numNaves" class="campo_label">Cantidad de naves</label>
                        <input type="int" class="campo_field" placeholder="Cantidad de naves del mismo tipo" name="numNaves">
                    </div>
                    <div class="campo">
                        <label for="numParc" class="campo_label">Numero de Parcec</label>
                        <input type="double" class="campo_field" placeholder="Cantidad de parcec que recorrera" name="numParc">
                    </div>
                </div> 
                <div class="flex alinear-centro">
                    <input type="submit" class="boton enviar w-sm-100" value="Enviar">
                </div>

            </fieldset>
        </form>
    </div>
</body>
</html>