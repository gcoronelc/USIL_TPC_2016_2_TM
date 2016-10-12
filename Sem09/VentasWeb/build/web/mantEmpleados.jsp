<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    <link href="menu/menu.css" rel="stylesheet" type="text/css"/>
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
      <section class="egcc_content">
        <h1>MANTENIMIENTO DE EMPLEADOS</h1>
        <form method="post" action="EmpleadoConsulta">
          <table>
            <tr>
              <td>Nombre</td>
              <td>Apellido</td>
              <td></td>
            </tr>
            <tr>
              <td><input type="text" name="nombre"/></td>
              <td><input type="text" name="apellido"/></td>
              <td>
                <input type="submit" value="Consultar" name="btnConsultar"/>
                <input type="submit" value="Nuevo" name="btnNuevo"/>
              </td>
            </tr>
          </table>
        </form>

      </section>
      <footer class="egcc_pie">
        <jsp:include page="pie.jsp" />
      </footer>
    </div>
  </body>
</html>
