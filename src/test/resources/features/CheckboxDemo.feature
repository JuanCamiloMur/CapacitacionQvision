#language: es
  
  Característica: Categoría Checkbox Demo

    La entrada HTML "checkbox" es un elemento de entrada para ingresar una matriz de valores diferentes.
    La casilla de verificación del tipo de entrada de Eash tiene un atributo de valor que se utiliza para definir
    el valor enviado por la casilla de verificación.
  
  @seleniumeasy
  Esquema del escenario: Demostracion de casilla de verificación
    Dado ingreso a la practica Check Box Demo
    Cuando selecciono el CheckBox
    Entonces me debe mostrar el mensaje <Mensaje esperado> en pantalla

    Ejemplos:
    |       Mensaje esperado       |
    |Success - Check box is checked|