#language: es

  Característica: Categoría Select Dropdown List

    Este sería su primer ejemplo en la lista desplegable de selección con Selenium.

  @seleniumeasy
  Esquema del escenario: Demostracion de lista de seleccion
    Dado ingreso a la practica Select Dropdown List
    Cuando seleciono el dia: <Dia>
    Entonces debe mostrar un mensaje con el dia seleccionado: <Dia>

    Ejemplos:
    |  Dia   |
    | Sunday |

