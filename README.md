# Base de datos  #

 <img src = " media / pantallaso consola.png"  alt = "imagen" style = "width: 200px;" />


 <img src = " media / pantallaso consola1.png"  alt = "imagen" style = "width: 200px;" />

 ## Busqueda en la base de datos ##
cd..=para devolvernos en las carpetas 
cd xampp= avanzar en las carpetas 
cd mysql
cd bin
mysql -u root -h localhost -p


- use (nombre de la base de datos a usar); =>ingresa a la base de datos seleccionada.
- show tables; =>ver las tablas de la base de datos seleccionada.
- describe (nombre de la tabla que queremos ver); =>describe que campos contiene dicha tabla.
- select * from (nombre de la tabla que queremos ver); => veremos dicha tabla llena con todos sus datos 
- select* from (nombre de la tabla que queremos ver) where (columna que sea primary key)=(fila); =>veremos un dato exacto que necesitemos.
- select (nombre de columna) from(nombre de la tabla); => veremos las columnas determinadas que seleccionemos. 

## Prueba ##
 tenemos el ejecutable y toda su linea de codigo de la base de datos.

lo podemos buscar en :
''
src/relaciones
''

## base de datos mysql##
esta base de datos tiene funcionalidad en mysql (http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=relaciones) realizadas

## Autor ##
Juan Camilo Restrepo Villa