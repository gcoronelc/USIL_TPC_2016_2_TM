<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>RESULTADO</h1>
    <P>Curso: ${requestScope.model.curso}</P>
    <P>Categoria: ${requestScope.model.categoria}</P>
    <P>Vacantes: ${requestScope.model.vacantes}</P>
    <P>Ingresos: ${requestScope.model.ingresos}</P>
    <P>Publicidad: ${requestScope.model.publicidad}</P>
    <P>Logistica: ${requestScope.model.logistica}</P>
    <P>Material: ${requestScope.model.materiales}</P>
    <P>Profesor: ${requestScope.model.profesor}</P>
    <P>Rentabilidad: ${requestScope.model.rentabilidad}</P>
    <a href="index.html">Home</a>&nbsp;&nbsp;
    <a href="AlmaFormulario">Retornar</a>
  </body>
</html>
