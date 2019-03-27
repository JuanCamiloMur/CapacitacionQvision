#language: es

  Característica: Categoría Table

    Este sería su primer ejemplo en con una tabla con Selenium.

  @seleniumeasy
  Esquema del escenario: Busqueda de un dato en una tabla
    Dado ingreso a la practica Table Data Search
    Cuando busco la tarea: <Tarea a buscar>
    Entonces me debe aparecer solo la tarea: <Tarea a buscar> en la tabla

    Ejemplos:
    |Tarea a buscar|
    |Bootstrap 3   |
