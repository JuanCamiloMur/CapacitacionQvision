#language: es

  Característica: Categoría JQuery Select dropdown

    Este sería su primer ejemplo con JQuery Select dropdown con Selenium.

  @seleniumeasy
  Escenario: Selección múltiple - Buscar y seleccionar múltiples estados
    Dado ingreso a la practica JQuery Select dropdown
    Cuando selecciono tres estados de norteamerica
    | New York   |
    | Alabama    |
    | New Mexico |
    Entonces deben estar visibles los estados antes seleccionados