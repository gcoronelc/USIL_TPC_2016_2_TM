<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SALUDO</title>
  </head>
  <body>
    <h1>SALUDO</h1>
    <p>Hola ${sessionScope.nombre}.</p>
    <a href="mensaje.jsp">Mensaje</a>
    <a href="FinSession">Fin de Session</a>
  </body>
</html>
