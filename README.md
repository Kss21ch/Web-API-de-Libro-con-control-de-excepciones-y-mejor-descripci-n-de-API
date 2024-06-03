# Modificaciones en el API de libros
Este repositorio contiene las modificaciones realizadas en el API de libros para cumplir con los siguientes requerimientos:
## 1. Si no existe el libro, lanzar una excepción LibroException al acceder al recurso GET /libros/{id_libro}, enviando el estado NOT_FOUND con un mensaje personalizado.
 
### Uso de GlobalException
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/3288063d-f176-43b2-87fc-5897cf8e92c8)

### LibroException
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/63dcfc56-2bec-4791-a0de-82bf2b953fcc)

## 2. Enviar el estado de CREATE al crear un nuevo libro.
### LibroController
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/544fe1de-a34f-4fb8-9fd1-d3cc1553749e)

### Crear LibroNuevo
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/40606219-d200-4109-a91e-afadae69aa6e)

# Modificaciones realizadas y probando los endpoints utilizando Postman
## 1. Manejo de excepción para libros no encontrados
Se ha implementado una excepción LibroException que se lanza cuando se intenta acceder a un libro que no existe. Esta excepción se captura y se envía el estado NOT_FOUND y un mensaje personalizado.
### Usando Get http://localhost:8080/Libros:
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/c8fc4f37-a067-4616-9841-39b1ae539e7d)

### Buscando por ID: http://localhost:8080/Libros/11
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/02125c46-a8c6-43c6-b449-4cf7223d4563)

### Si no hay un libro con un id no debe aparecer: http://localhost:8080/Libros/17
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/31b21dec-0483-4d57-a4cc-8aa09216c1f0)

## 2. Envío del estado de CREATE al crear un libro
### Al crear un nuevo libro, se envía el estado de CREATE junto con la respuesta.
![image](https://github.com/Kss21ch/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147552972/6ff92b6c-bfec-4805-a1bc-ed9d8cbf3d6f)

