<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CONSULTA DE PRODUCTOS</title>
  </head>
  <body>
    <h1>CONSULTA DE PRODUCTOS</h1>
    <div>
      <form id="form1">
        <label>Código de producto:</label>
        <input type="text" name="id" />
        <input type="button" id="btnConsultar" value="Consultar" title="Consultar producto."/>
      </form>
    </div>
    <div>
      
    </div>
    <script>
      
      $("#btnConsultar").click(function(){
        var data = $("#form1").serialize();
        $.post("ProductoTraerUno",data,function(obj){
          if(obj.code == 1){
            alert("Bien, falta mostrar los datos.");
          } else {
            alert(obj.text);
          }
        });
      });
      
    </script>
  </body>
</html>
