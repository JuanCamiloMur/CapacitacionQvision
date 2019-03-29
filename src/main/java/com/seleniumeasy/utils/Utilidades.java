package com.seleniumeasy.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;

public class Utilidades extends PageObject {

  public static boolean validacionNumero(String cadena) {
    boolean resultado;
    try {
      Integer.parseInt(cadena);
      resultado = true;
    } catch (NumberFormatException excepcion) {
      resultado = false;
    }
    return resultado;
  }

  public void compararResultado(WebElementFacade wElement, String valorEsperado) {
    boolean resultado;
    int numeroEsperado;
    int numeroMostrado;
    wElement.waitUntilVisible();
    String valorPantalla = wElement.getText();
    if (validacionNumero(valorPantalla)) {
      numeroMostrado = Integer.parseInt(valorPantalla);
      numeroEsperado = Integer.parseInt(valorEsperado);
      resultado = numeroMostrado == numeroEsperado;
    } else {
      resultado = valorEsperado.equals(valorPantalla);
    }
    MatcherAssert.assertThat(
        String.format(
            "El valor esperado no es igual al valor mostrado en pantalla. Valores encontrados: "
                + "Valor esperado = %s ;Valor mostrado = %s.",
            valorEsperado, valorPantalla),
        resultado);
  }
}
