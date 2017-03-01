<%-- 
    Document   : index
    Created on : 25/02/2017, 03:28:13 PM
    Author     : carandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="mainStyle.css"/>
        <title>No flaya</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <header>
            <h1> World Of CaNi </h1>
        </header>
        <article>
        <h2>Selecciona tu personaje</h2>
        <form method="post" action="crearPersonaje">
             <select id="cb" name="comboBox" class="combo">   
                <option value="Guerrero">Guerrero</option>
                <option value="Cazador">Cazador</option>
                <option value="Sacerdote">Sacerdote</option>
                <option value="Brujo">Brujo</option>

             </select>
            <input id="crear" type="submit" value="Crear">
        </form>
        </article>
        </body>
</html>
