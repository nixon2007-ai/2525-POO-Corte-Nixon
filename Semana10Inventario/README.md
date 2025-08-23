# Nombre del autor

Corte Salinas Nixon Dario


# Sistema de Gestión de Inventario de Celulares

Este proyecto es un sistema de gestión de inventario diseñado para ayudar a las tiendas a administrar la venta de celulares. Permite agregar, eliminar y mostrar productos en el inventario, así como guardar los datos en un archivo para su persistencia.


# Porque es importante llevar un inventario de venta de celulares

Llevar un inventario en la venta de celulares es clave para saber qué modelos están disponibles y evitar pérdidas por productos obsoletos. Además, permite planificar mejor las compras y satisfacer la demanda del cliente a tiempo.


## Características

- **Agregar Celulares**: Permite al usuario agregar nuevos modelos de celulares al inventario.
- **Eliminar Celulares**: Facilita la eliminación de modelos de celulares del inventario.
- **Mostrar Inventario**: Muestra todos los celulares disponibles en el inventario, ordenados alfabéticamente.
- **Persistencia de Datos**: Los datos se guardan en un archivo de texto, permitiendo que los cambios se mantengan entre ejecuciones del programa.


## Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Manejo de Archivos

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- **Producto**: Representa un celular con atributos como nombre, precio y cantidad.
- **GestorDeArchivo**: Maneja la lectura y escritura de datos en un archivo.
- **Inventario**: Contiene la lógica para agregar, eliminar y mostrar los celulares en el inventario.
- **Main**: Punto de entrada del programa que proporciona un menú interactivo para la gestión del inventario.

## Requisitos

- JDK 8 o superior
- Un entorno de desarrollo Java (IDE) como IntelliJ IDEA, Eclipse o NetBeans.

## Instalación

1. Clona este repositorio o descarga los archivos del proyecto.
2. Abre tu IDE y crea un nuevo proyecto Java.
3. Agrega los archivos `.java` al proyecto.
4. Asegúrate de que todos los archivos estén en el mismo paquete (`inventario`).

## Uso

1. Ejecuta la clase `Main`.
2. Selecciona una opción del menú:
   - **1**: Agregar celular
   - **2**: Eliminar celular
   - **3**: Mostrar inventario
   - **4**: Salir
3. Sigue las instrucciones en pantalla para interactuar con el sistema.

## Ejemplo de Uso

```plaintext
¡Bienvenido al Sistema de Gestión de Inventario de Celulares realizado por el estudiante CORTE SALINAS NIXON DARIO!

Seleccione una opción:
1. Agregar celular
2. Eliminar celular
3. Mostrar inventario
4. Salir
