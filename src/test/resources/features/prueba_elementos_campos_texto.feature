#language: es

  Característica: Prueba campos de texto

    Como usuario quiero ingresar texto o nuermos en varios Inputs

    @seleniumeasy
    @envio_mensaje
    Esquema del escenario: Envio de mensaje
      Dado ingreso a la practica Simple Form Demo
      Cuando envio el mensaje <mensaje>
      Entonces el mensaje debe mostrase en pantalla

      Ejemplos:
      | mensaje     |
      | Como fue!!! |

    @seleniumeasy
    @suma_numeros_enteros
    Escenario: Suma de enteros
      Dado ingreso a la practica Simple Form Demo
      Cuando ingreso los numeros enteros
      Entonces el resultado debe mostrase en pantalla
