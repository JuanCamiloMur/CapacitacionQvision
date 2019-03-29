package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.JavascriptAlertsStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class JavascriptAlertsDefinition {

  @Steps JavascriptAlertsStep javascriptAlertsStep;

  @Cuando("^ingreso la palabra: (.*) en el prompt box$")
  public void ingresoNombreAlertaJavascript(String palabra) {
    javascriptAlertsStep.ingresoNombrePromptAlert(palabra);
  }

  @Entonces("^debe aparecer un mensaje con la palabra: (.*)$")
  public void validacionNombre(String palabra) {
    javascriptAlertsStep.validarMensajeMostrado(palabra);
  }
}
