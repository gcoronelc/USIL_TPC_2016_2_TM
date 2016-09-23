<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    <title>MI APLICACION</title>
  </head>
  <body>
    <div class="egcc_page">
      <div class="egcc_header">
        <jsp:include page="header.jsp" />
      </div>
      <div class="egcc_menu">
        <jsp:include page="menu.jsp" />
      </div>
      <div class="egcc_content">
        <h1>CURSO</h1>
        <p>Nombre: </p>
        <p>Ciclo: IV</p>
        <p>Periodo: 2016-II</p>
        <p>Profesor: Yo</p>
        <h1>EQUIPO</h1>
        <p>Integrante 1: Jaimito</p>
        <p>Integrante 2: Pepito</p>
        <p>Integrante 3: Juanita</p>
        <p>Integrante 4: Panchito</p>
      </div>
      <div class="egcc_pie">
        <jsp:include page="pie.jsp" />
      </div>
    </div>
  </body>
</html>
