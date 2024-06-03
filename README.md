# Modificaciones en el API de libros
Este repositorio contiene las modificaciones realizadas en el API de libros para cumplir con los siguientes requerimientos:
	## 1. Si no existe el libro, lanzar una excepción LibroException al acceder al recurso GET /libros/{id_libro}, enviando el estado NOT_FOUND con un mensaje personalizado.
###Uso de GlobalException
 ![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/27af711c-264b-4b09-8b40-14124591703a)

### LibroException
 
## 2. Enviar el estado de CREATE al crear un nuevo libro.
### LibroController
 
### Crear LibroNuevo
 
# Modificaciones realizadas y probando los endpoints utilizando Postman
## 1. Manejo de excepción para libros no encontrados
Se ha implementado una excepción LibroException que se lanza cuando se intenta acceder a un libro que no existe. Esta excepción se captura y se envía el estado NOT_FOUND y un mensaje personalizado.
Usando Get http://localhost:8080/Libros:
 
### Buscando por ID: http://localhost:8080/Libros/11
 
### Si no hay un libro con un id no debe aparecer: http://localhost:8080/Libros/17
 
2.	## Envío del estado de CREATE al crear un libro
### Al crear un nuevo libro, se envía el estado de CREATE junto con la respuesta.
 



