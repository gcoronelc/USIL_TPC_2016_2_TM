<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/disen.css" rel="stylesheet" type="text/css"/>
        <title>Examen Parcial</title>
    </head>
    <body>
  <h1>LUZ DEL SUR</h1>
        <form method="post" action="Luz">
            Lectura del mes anterior:
            <input type="text" name="anterior" />
            Lectura del mes actual:
            <input type="text" name="actual" />
            <input type="submit" value="Procesar"/>
        </form>

        <!-- Resultado -->
          <c:if test="${requestScope.model != null}">
            <h2>REPORTE DE CONSUMO</h2>
            <table border="1" class="ta">
                <!-- Cabecera de tabla -->
                <tr>
                    <th>CONSUMO</th>
                    <th>IMPORTE</th>                   
                </tr>
                    <tr>
                        <th>${requestScope.model.consumo}</th>
                        <th>${requestScope.model.total}</th>
                        
                    </tr>
            </table>
        </c:if>
    </body>
</html>
