<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table style="width: 100%; vertical-align: middle;">
  <tr>  
    <td style="text-align: right;">
      Usuario: ${sessionScope.usuario.id}<br/>
      <a href="#">Salir</a>
    </td>
  </tr>
</table>
