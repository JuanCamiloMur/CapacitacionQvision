package com.seleniumeasy.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;

public class Utilidades extends PageObject {

    public void compararResultado (WebElementFacade wElement, String valorEsperado, String operadorLogico){
        wElement.waitUntilVisible();
        String valorPantalla = wElement.getText();
        MatcherAssert.assertThat(
                String.format(
                        "El valor esperado no es %s al valor mostrado en pantalla. Valores encontrados: " +
                                "Valor esperado = %s ;Valor mostrado = %s.",
                        operadorLogico, valorEsperado, valorPantalla),
                valorPantalla.equals(valorEsperado));
    }
}
