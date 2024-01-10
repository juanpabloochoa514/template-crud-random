# template-crud-random
<html>
  <head>
    <li>Este proyecto es una plantilla de un crud básico. Para ser usado en cualquier caso de uso.</li>
  </head>
  <body>
  <li>En la carpeta repository se puede observar las consultas dinamicas, realizadas manualmente. Se observan update, delete y listar.</li>
  <li> <small>Use el metodo save() de la interface de JpaRepository Para trabajar mas rapido. Podría haber hecho una consulta con el lenguaje de sql. De la siguiente manera: INSERT INTO shirt columnas VALUES valores a ingresar</small></li>
    <li><small>En el protocolo http de POST se ingresa una camisa con los datos requeridos de modelo, marca de modelo y precio en double(0.0).</small></li>
    <li><small>En el protocolo http de GET se puede observar que la API REST lista segun la marca de la camisa que se ingresa en el endpoint.</small></li>
    <li><small>En el protocolo PUT se puede  modificar un modelo de camisa segun su id.Ingresando dicho ID en el endpoint.</small></li>
    <li><small>En el protocolo DELETE se elimina una camisa segun su id. Ingresando su ID en el endpoint</small></li>
  </body>
</html>
