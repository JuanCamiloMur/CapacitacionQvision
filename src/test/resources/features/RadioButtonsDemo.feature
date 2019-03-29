#language: es

  Característica: Categoría Radio Buttons Demo

    Este es nuevamente un ejemplo simple para comenzar a trabajar con los botones de radio usando Selenium.

  @seleniumeasy
  Esquema del escenario: Demostración del Radio Button
    Dado ingreso a la practica Radio Buttons Demo
    Cuando selecciono el Radio Button <Genero>
    Entonces debe mostrar un mensaje con el genero seleecionado: <Genero>

    Ejemplos:
      | Genero |
      | Female |