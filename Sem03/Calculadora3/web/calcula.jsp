<%@page import="pe.usil.calculadora.model.MateModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
MateModel model = (MateModel) request.getAttribute("model");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/egcc.css" rel="stylesheet" type="text/css"/>
    <title>CALCULADORA</title>
  </head>
  <body>
    <div class="egcc_page">
      <img alt="" src="img/logo.png" />
      <h1>CALCULADORA</h1>
      <table>
        <tr>
          <td>Operador:</td>
          <td><%= model.getOpera() %></td>
        </tr>
        <tr>
          <td>Número 1:</td>
          <td><%= model.getN1() %></td>
        </tr>
        <tr>
          <td>Número 2:</td>
          <td><%= model.getN2() %></td>
        </tr>
        <tr>
          <td>Resultado:</td>
          <td><%= model.getRpta() %></td>
        </tr>
      </table>
      <a href="index.html">Volver</a>
    </div>
  </body>
</html>
