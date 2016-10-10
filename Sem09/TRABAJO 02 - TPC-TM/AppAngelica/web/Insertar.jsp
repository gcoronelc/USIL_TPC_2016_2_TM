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
                <h1>Insertar Articulo</h1>
                <form method="post" action="InsertarProductoSave">
                    <table>
                        <tr>
                            <td>Categoría:</td>
                            <td>
                                <select name="cat">
                                    <option value="0">Seleccionar</option>
                                    <option value="1">Bebidas</option>
                                    <option value="2">Carnes</option>
                                    <option value="3">Pollo</option>
                                    <option value="4">Postres</option>
                                    <option value="5">Combos</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Nombre:</td>
                            <td><input type="text" name="nombre" /></td>
                        </tr>
                        <tr>
                            <td>Precio:</td>
                            <td><input type="text" name="precio" /></td>
                        </tr>
                        <tr>
                            <td>Stock:</td>
                            <td><input type="text" name="stock" /></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value="Registrar" /></td>
                        </tr>
                    </table>
                </form>
                <c:if test="${requestScope.error != null}">
                    <p class="egcc_error">${requestScope.error}</p>
                </c:if>
                <c:if test="${requestScope.codigo != null}">
                    <p>El código del artículo es: ${requestScope.codigo}.</p>
                </c:if>
            </div>      
            <div class="pie">
                <jsp:include page="pie.jsp" />
            </div>     
        </div>     
    </body>
</html>
