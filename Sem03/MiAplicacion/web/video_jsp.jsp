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
        <h1>JSP IN ACTION</h1>
        <iframe width="770" height="400" src="https://www.youtube.com/embed/1aYIxS8m8qw" frameborder="0" allowfullscreen></iframe>
      </div>
      <div class="egcc_pie">
        <jsp:include page="pie.jsp" />
      </div>
    </div>
  </body>
</html>
