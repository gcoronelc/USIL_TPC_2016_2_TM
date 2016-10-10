<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/diseño.css" rel="stylesheet" type="text/css"/>
        <link href="menu/menu.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>   
        <div class="page">     
            <div class="cabecera">
                <jsp:include page="cabecera.jsp" />
            </div>      
            <div class="menu">
                <jsp:include page="menu/menu.jsp" />
            </div>      
            <div class="contenido">
                <c:if test="${requestScope.error}">
                    <p style="color:red;">${requestScope.error}</p>
                </c:if>
                <h1>Buscar articulo</h1>
                 <form method="post" action="Articulocontroller">
                    Producto:
                    <input type="text" name="producto" />
                    <input type="submit" value="Procesar"/>
                </form>
                 <c:if test="${requestScope.lista != null}">
                    <h1>REPORTE DE PRODUCTOS</h1>
                    <table border="1">
                        <tr>
                            <th>ID PRODUCTO</th>
                            <th>ID CATEGORIA</th>                          
                            <th>NOMBRE PRODUCTO</th>
                            <th>PRECIO</th>
                            <th>STOCK</th>
                        </tr>
                        <c:set var="estilo" value="tabla_row1" />
                        <c:forEach items="${requestScope.lista}" var="l">
                            <tr class="${estilo}">
                                <td>${l.IdArticulo}</td>
                                <td>${l.IdCategoria}</td>
                                <td>${l.NomArticulo}</td>
                                <td>${l.PreArticulo}</td>
                                <td>${l.Stock}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </div>      
            <div class="pie">
                <jsp:include page="pie.jsp" />
            </div>     
        </div>     
    </body>
</html>
