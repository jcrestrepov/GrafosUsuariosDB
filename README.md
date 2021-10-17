# Descripción #
Se realiza un proyecto de base de datos con la finalidad  de ejecutar una búsqueda de usuarios y así facilitar la  informacion y relaciones entre usuarios.

![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/modo%20grafico.png)

# Creación de la base de datos #
comenzamos creando la base de datos en mysql(phpmyadmin) por el modo grafico. esta  tambien puede ser creada  desde la consola usando (querys) para crear base de datos.


## Base de datos  ##
 como efectuar la busqueda desde la consola 

![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/pantallaso%20consola.png)


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/pantallaso%20consola1.png)

 # Busqueda en la consola #
 podemos observar los comandos de busqueda (query) que debemos ejecutar para realizar la busqueda . Dicha busqueda la realizamos desde la consola.

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

# Aplicacion en java #
![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/apiingreso%20datos.png)


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/apiinfo.png)
## Prueba ##
 tenemos el ejecutable el cual consiste en igresar los datos de un nuevo usuario. tambien podemos modificar, eliminar y realizar busquedas especificas.
 
 
 toda la linea de codigo de la base de datos la podemos buscar en :
''
src/relaciones
''

## base de datos mysql ##
esta base de datos tiene funcionalidad en mysql (http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=relaciones) realizadas

## Autor ##
Juan Camilo Restrepo Villa