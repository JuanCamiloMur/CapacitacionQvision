#language: es

  Característica: Categoría Input Forms

    La etiqueta input especifica un campo de entrada donde el usuario puede ingresar datos.

    @seleniumeasy
    Esquema del escenario: Demostracion de campo de texto
      Dado ingreso a la practica Simple Form Demo
      Cuando envio el mensaje <Mensaje>
      Entonces el mensaje <Mensaje> debe mostrase en pantalla

      Ejemplos:
      | Mensaje     |
      | Como fue!!! |

    @seleniumeasy
    Escenario: Demostracion de suma con dos campos de texto
      Dado ingreso a la practica Simple Form Demo
      Cuando ingreso los numeros:
        | 50 | 80 |
      Entonces el resultado debe mostrase en pantalla