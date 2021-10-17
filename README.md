# Descripción 
Se realiza un proyecto de base de datos con la finalidad de ejecutar una búsqueda de usuarios y así facilitar la información y relaciones entre usuarios.


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/modo%20grafico.png)


# Creación de la base de datos #
Comenzamos creando la base de datos en MySQL(phpmyadmin) por el modo gráfico. esta también puede ser creada desde la consola usando (querys) para crear base de datos.



## Base de datos ##
 Como efectuar la búsqueda desde la consola 


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/pantallaso%20consola.png)


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/pantallaso%20consola1.png)

  # Búsqueda en la consola #
Podemos observar los comandos de búsqueda (query) que debemos ejecutar para realizar la búsqueda. Dicha búsqueda la realizamos desde la consola.

cd..=para devolvernos en las carpetas 
cd xampp= avanzar en las carpetas 
cd MySQL
cd bin
mysql -u root -h localhost -p

- use (nombre de la base de datos a usar); =>ingresa a la base de datos seleccionada.
- show tables; =>ver las tablas de la base de datos seleccionada.
- describe (nombre de la tabla que queremos ver); =>describe que campos contiene dicha tabla.
- select * from (nombre de la tabla que queremos ver); => veremos dicha tabla llena con todos sus datos 
- select* from (nombre de la tabla que queremos ver) where (columna que sea primary key)=(fila); =>veremos u dato exacto que necesitemos.
- select (nombre de columna) from (nombre de la tabla); => veremos las columnas determinadas que seleccionemos. 


# Aplicación en java #
![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/apiingreso%20datos.png)


![image description or alt text](https://raw.githubusercontent.com/jcrestrepov/GrafosUsuariosDB/main/media/apiinfo.png)
## Prueba ##
 Tenemos el ejecutable el cual consiste en ingresar los datos de un nuevo usuario. También podemos modificar, eliminar y realizar búsquedas específicas.
 

 
 Toda la línea de código de la base de datos la podemos buscar en:
''
src/relaciones
''



## Base de datos MySQL ##
Esta base de datos tiene funcionalidad en MySQL (http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=relaciones) realizadas

## Autor ##
Juan Camilo Restrepo Villa
