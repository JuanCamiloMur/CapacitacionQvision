package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.SeleniumEasyTestStep;
import com.seleniumeasy.steps.SimpleFormDemoStep;
import cucumber.api.DataTable;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoDefinition {

  @Steps SeleniumEasyTestStep seleniumEasyTestStep;

  @Steps SimpleFormDemoStep simpleFormDemoStep;

  private List<String> numerosEnteros;

  @Dado("^ingreso a la practica (.*)$")
  public void realizarPractica(String practica) {
    seleniumEasyTestStep.ingresarPractica(practica);
  }

  @Cuando("^ingreso los numeros:$")
  public void sumaEnteros(DataTable numeros) {
    this.numerosEnteros = numeros.asList(String.class);
    simpleFormDemoStep.sumarNumerosEnteros(numerosEnteros);
  }

  @Cuando("^envio el mensaje (.*)$")
  public void envioMensaje(String mensaje) {
    simpleFormDemoStep.enviarMensaje(mensaje);
  }

  @Entonces("^el mensaje (.*) debe mostrase en pantalla$")
  public void validacionMensajeEnviadoCorrectamentePantalla(String mensaje) {
    simpleFormDemoStep.validarMensaje(mensaje);
  }

  @Entonces("^el resultado debe mostrase en pantalla$")
  public void validacionResultadoCorrectamentePantalla() {
    simpleFormDemoStep.validarSuma();
  }
}
