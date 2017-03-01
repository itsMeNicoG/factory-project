<%-- 
    Document   : VistaPersonaje
    Created on : 25/02/2017, 04:12:12 PM
    Author     : carandy
--%>

<%@page import="Fabrica.FabricaPjAbs "%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%                      
        String arma=(String)session.getAttribute("Arma");
        String escudo=(String)session.getAttribute("Escudo");
        String botas=(String)session.getAttribute("Botas");
        String traje=(String)session.getAttribute("Traje");
        String casco=(String)session.getAttribute("Casco");
    %>
<head>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="mainStyle.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>No flaya</title>
    
    <script type="text/javascript">
        var arma    =   new Image();
        var escudo  =   new Image();
        var botas   =   new Image();
        var traje   =   new Image();
        var casco   =   new Image();
        var inicio=100;
        function dibujarCanvas(){
        arma.src = '<%=arma%>';
        escudo.src = '<%=escudo%>';
        botas.src = '<%=botas%>';
        traje.src = '<%=traje%>';
        casco.src = '<%=casco%>';
        
        var canvas = document.getElementById('miCanvas');
        var ctx = canvas.getContext('2d');
	      // imagen                
            arma.onload = function(){
                    ctx.drawImage(casco,400,inicio*0+20,100,100);  // imagen completa en la posición (0,0) 
            };
            escudo.onload = function(){
                    ctx.drawImage(arma,300,inicio*1+20,100,100);  // imagen completa en la posición (0,0) 
            };
            botas.onload = function(){
                    ctx.drawImage(escudo,490,inicio*1+20,100,100);  // imagen completa en la posición (0,0) 
            };
            traje.onload = function(){
                    ctx.drawImage(traje,400,inicio*1+20,100,100);  // imagen completa en la posición (0,0) 
            };
            casco.onload = function(){
                    ctx.drawImage(botas,400,inicio*2+20,100,100);  // imagen completa en la posición (0,0) 
            };
                
        ctx.strokeRect(0,0,canvas.width, 600);
        }
	
		
    </script>
    
  </head>
  <body onload="dibujarCanvas()">
      <header>
          <h1><a href="index.jsp"> World Of CaNi </a></h1>
        </header>
      <article id="mostrar">
      <canvas  id="miCanvas" width="900" height="350">Su navegador no soporta Canvas.</canvas>
      <br>
      </article>
      <%--
    <image  src=<%=arma%>>
    <br>
    <image src=<%=escudo%>>
    <br>
    <image src=<%=botas%>>
    <br>
    <image src=<%=traje%>>
    <br>
    <image src=<%=casco%>>
    <br>  
    --%>
  </body>
</html>
