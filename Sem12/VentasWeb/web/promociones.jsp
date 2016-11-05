<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    <link href="menu/menu.css" rel="stylesheet" type="text/css"/>
    <link href="css/tabla.css" rel="stylesheet" type="text/css"/>
    <script src="jquery/jquery.js" type="text/javascript"></script>
    <script src="js/egcc.js" type="text/javascript"></script>
    <title>.:: VENTAS ::.</title>
  </head>
  <body>
    <div class="egcc_page">
      <header class="egcc_header">
        <jsp:include page="header.jsp" />
      </header>
      <section class="egcc_menu">
        <jsp:include page="menu/menu.jsp" />
      </section>

      <section id="_content" class="egcc_content">
        <h1>PROMOCIONES</h1>

        <form method="post" action="PrommcionConsultar">
          <fieldset>
            <legend>Filtro</legend>
            <label>Código de producto:</label>
            <input type="text" name="idprod" />
            <input type="submit" value="Consultar" />
          </fieldset>
        </form>


        
        
      </section>


      <footer class="egcc_pie">
        <jsp:include page="pie.jsp" />
      </footer>
    </div>
  </body>
</html>
