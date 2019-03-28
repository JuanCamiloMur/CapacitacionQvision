#language: es

  Característica: Categoría Table

    Este sería su primer ejemplo en con una tabla con Selenium.

  @seleniumeasy
  Esquema del escenario: Busqueda de un dato en una tabla
    Dado ingreso a la practica Table Data Search
    Cuando busco la tarea: <Tarea a buscar>
    Entonces me debe aparecer los siguientes datos en la tabla: <Tarea a buscar>

    Ejemplos:
    |Tarea a buscar|
    |Bootstrap 3   |

    @seleniumeasy
    Esquema del escenario: Busqueda de un dato en una tabla
      Dado ingreso a la practica Table Data Search
      Cuando busco el usuario: <Usuario>
      Entonces me debe aparecer los datos del usuario: <Mensaje no encontrado>

      Ejemplos:
        |Usuario     |Mensaje no encontrado|
        |JavierGarzas|No result found      |
