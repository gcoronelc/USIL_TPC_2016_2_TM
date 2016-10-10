<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/diseño.css" rel="stylesheet" type="text/css"/>
    <title>INICIO DE SESION</title>
    <style>
      #_pagina{
        width: 600px;
        height: 400px;
        margin: 20px auto;
        padding: 15px;
        border: bisque solid medium;
        background-color: turquoise;
        color: black;
      }
    </style>
    </head>
    <body>
    <div id="_pagina">
      <h1>INICIO DE SESIÓN</h1>
      <p>${requestScope.error}</p>
      <form method="post" action="LoginIngreso">
        <table>
          <tr>
            <td>Usuario:</td>
            <td><input type="text" name="usuario" /></td>
          </tr>
          <tr>
            <td>Clave:</td>
            <td><input type="password" name="clave" /></td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="submit" value="Ingresar"/>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </body>   
</html>
