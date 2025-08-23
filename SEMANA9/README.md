# Proyecto Java de la Semana 9: Gestor de Archivos

## Autor

Corte Salinas Nixon Dario

## Descripción

Este proyecto Java implementa un sistema para gestionar archivos de texto, permitiendo guardar contenido, leerlo y validar si el archivo está vacío. Incluye manejo de excepciones personalizadas para mejorar la robustez del programa.

## Clases Incluidas

### 1. `GestorDeArchivo`
Clase encargada de manejar operaciones de lectura y escritura en archivos de texto.

- `guardar(String nombreArchivo, String contenido)`: Guarda el contenido en el archivo especificado.
- `leer(String nombreArchivo)`: Lee el contenido del archivo línea por línea y lo devuelve como una cadena.

### 2. `ArchivoVacioException`
Excepción personalizada que se lanza cuando se detecta que un archivo está vacío.

- Constructor con mensaje personalizado.

### 3. `ValidadorArchivo`
Clase que verifica si un archivo está vacío.

- `verificarNoVacio(String nombreArchivo)`: Lanza `ArchivoVacioException` si el archivo no contiene contenido.

### 4. `Main`
Clase principal que ejecuta el programa.

- Guarda contenido en un archivo.
- Lee el contenido del archivo y lo muestra por consola.
- Verifica si el archivo está vacío y maneja la excepción correspondiente.

## Ejecución

Puedes compilar y ejecutar estas clases en un entorno de desarrollo Java como Eclipse, IntelliJ IDEA o desde la línea de comandos, por lo general con Apache Netbeans 24 ya que ete IDE usamos para ejecutar y trabajar con java.

### Requisitos

- Java JDK instalado
- Permisos para crear y escribir archivos en el directorio de ejecución

### Ejemplo de ejecución desde la terminal

```bash
javac Main.java
java Main
