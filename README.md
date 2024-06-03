# Modificaciones en el API de libros
Este repositorio contiene las modificaciones realizadas en el API de libros para cumplir con los siguientes requerimientos:
	## 1. Si no existe el libro, lanzar una excepción LibroException al acceder al recurso GET /libros/{id_libro}, enviando el estado NOT_FOUND con un mensaje personalizado.
 
###Uso de GlobalException
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/27af711c-264b-4b09-8b40-14124591703a)

### LibroException
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/0a9f0927-a293-4060-b69d-b0495a7e1c10)

## 2. Enviar el estado de CREATE al crear un nuevo libro.
### LibroController
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/86867c1d-08c2-4721-a123-2f9a2175021a)

### Crear LibroNuevo
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/d0418d50-6326-44e5-a31a-b91625793158)

# Modificaciones realizadas y probando los endpoints utilizando Postman
## 1. Manejo de excepción para libros no encontrados
Se ha implementado una excepción LibroException que se lanza cuando se intenta acceder a un libro que no existe. Esta excepción se captura y se envía el estado NOT_FOUND y un mensaje personalizado.
### Usando Get http://localhost:8080/Libros:
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/2ee133bb-a911-4dbc-81b3-98c13db46a33)

### Buscando por ID: http://localhost:8080/Libros/11
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/42be6502-1daa-467e-9bae-ae4c0fc65860)

### Si no hay un libro con un id no debe aparecer: http://localhost:8080/Libros/17
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/55783cb3-fd1f-4f3c-b686-509f8668d0d4)

## 2. Envío del estado de CREATE al crear un libro
### Al crear un nuevo libro, se envía el estado de CREATE junto con la respuesta.
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/6b02d55c-0d2c-43d8-9e08-e49f2a926d31)




