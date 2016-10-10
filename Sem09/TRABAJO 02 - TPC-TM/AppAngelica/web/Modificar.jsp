<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
             Informacion xD
            </div>      
            <div class="pie">
                <jsp:include page="pie.jsp" />
            </div>     
        </div>     
    </body>
</html>
