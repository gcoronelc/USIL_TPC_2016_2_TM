<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>NAVEGANDO ANDO</h1>

        <!-- Mostrando el Error -->
        <c:if test="${requestScope.error}">
            <p style="color:red;">${requestScope.error}</p>
        </c:if>

        <!-- Formulario -->
        <form method="post" action="NavegandoController">
            Consumo del mes:
            <input type="text" name="consumo" />
            <input type="submit" value="Procesar"/>
        </form>

        <!-- Resultado -->
        <c:if test="${requestScope.repo != null}">
            <h2>REPORTE DE CONSUMO</h2>
            <table border="1">
                <!-- Cabecera de tabla -->
                <tr>
                    <th>DESCRIPCION</th>
                    <th>COSTO x GB</th>
                    <th>CANT DE GB</th>
                    <th>IMPORTE</th>
                </tr>
                <!-- Detalle de la tabla -->
                <c:forEach items="${requestScope.repo}" var="r">
                    <tr>
                        <td>${r.descripcion}</td>
                        <td>${r.precio}</td>
                        <td>${r.consumo}</td>
                        <td>${r.importe}</td>
                    </tr>
                </c:forEach>
                    <tr>
                        <th colspan="2">${requestScope.total.descripcion}</th>
                        <th>${requestScope.total.consumo}</th>
                        <th>${requestScope.total.importe}</th>
                    </tr>
            </table>
        </c:if>
    </body>
</html>
