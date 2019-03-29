package com.seleniumeasy.steps;

import com.seleniumeasy.pages.SimpleFormDemoPage;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SimpleFormDemoStep {

  @Page SimpleFormDemoPage simpleFormDemoPage;

  @Step
  public void enviarMensaje(String mensaje) {
    simpleFormDemoPage.ingresarMensaje(mensaje);
    simpleFormDemoPage.enviarMensaje();
  }

  @Step
  public void validarMensaje(String mensaje) {
    simpleFormDemoPage.validarResultadoMensaje(mensaje);
  }

  @Step
  public void sumarNumerosEnteros(List<String> numerosEnteros) {
    AtomicInteger cont = new AtomicInteger();
    cont.getAndIncrement();
    numerosEnteros.forEach(
        numeros -> simpleFormDemoPage.ingresarNumeros(numeros, cont.getAndIncrement()));
    simpleFormDemoPage.obtenerTotalSuma();
  }

  @Step
  public void validarSuma() {
    simpleFormDemoPage.validarResultadoSuma();
  }
}
