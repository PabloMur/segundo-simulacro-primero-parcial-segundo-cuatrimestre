# Sistema de Gestión de Aeropuerto - Astor Piazzolla

Este proyecto implementa un sistema para administrar la flota de aviones del **Aeropuerto Internacional Astor Piazzolla**. Permite gestionar diferentes tipos de aviones y hangares, teniendo en cuenta la capacidad operativa del aeropuerto y las particularidades de cada tipo de avión.

## Características principales

- Registro de **aeropuerto**: nombre, código internacional, dirección y capacidad operativa.
- Gestión de **hangares** usando un `Map` donde la clave es el nombre del hangar y el valor es una lista de aviones.
- Tipos de aviones:
  - **Comercial**: cantidad de azafatas y lista de servicios.
  - **Privado**: indicador de Jacuzzi, clave de WiFi y posibilidad de ver el mundial.
  - **Carga**: capacidad en kilos y lista de productos a transportar.
  - **Militar**: sistema de armas (aire-aire o aire-tierra) y cantidad de balas.
- Todos los aviones pueden **despegar, volar y aterrizar**.
- Aviones comerciales y privados pueden **servir comida y dar mantas**.
- Aviones de carga y militares tienen un método de ingreso y los de carga pueden **descargar contenido**.
- Validación de la **capacidad operativa** del aeropuerto al agregar aviones.
- Método para **despegar todos los aviones de un hangar específico**.

## Uso

El sistema incluye un menú interactivo por consola para:

- Agregar aviones de distintos tipos a los hangares correspondientes.
- Listar los aviones de un hangar.
- Despegar todos los aviones de un hangar.
