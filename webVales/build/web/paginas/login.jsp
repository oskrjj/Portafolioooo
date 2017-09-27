<%-- 
    Document   : login
    Created on : 24-sep-2017, 23:09:23
    Author     : Malandragem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="../css/bootstrap.css"/>
       
        <style>
            body {background-color: #000\9 ;}
            h1   {color: buttonface;}
           
        </style>
        <title>JSP Inicio</title>
    </head>
   <!-- <body style="background-image: url(img/circus-circus-dining-buffet.jpg)"> -->
        <div style="text-align:center;" id="contenido" class="container">
            
              <h1><strong>Bienvenido</strong></h1>
            <div id="idTransparente" class="index1 container"></div>
            <div id="idLogin" class="index2 container">                 
                <form action="../ServLogin" method="POST">
                    <div class="form-group container-fluid">
                        <label>Usuario</label>
                        <input class="form-control" type="text" name="txtRutUsuario"/>
                        <label>Contraseña</label>
                        <input class="form-control" type="password" name="txtPassword"/>
                        <br/>
                        <input class="btn btn-primary" type="submit" value="Ingresar"/>
                    </div>
                </form>
                <a id="link" href="">¿Recuperar contraseña?</a>
                <div id="errorLogin">
                 ${sesionErrorLogin}   
                </div>                
            </div> 
        </div>
        
    </body>




     <% String mensaje
                    = (String) request.getAttribute("problema");
            if (mensaje != null) {
        %>
        <script>
            alert("<%= mensaje%>");
        </script>
        <% }%>
        <% String mensaje2
                    = (String) request.getAttribute("error");
            if (mensaje2 != null) {
        %>
        <script>
            alert("<%= mensaje2%>");
        </script>
        <% }%>
    </body>
</html>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
    
    
  <script>
      function entrar(){
      $("#btnEntrar").click(function(){
        $("#formLogin").submit();
        });
      }
      $(document).ready(function() {
        entrar();
      });
  </script>
    
    
    
  </body>
</html>


