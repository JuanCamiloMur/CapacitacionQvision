package com.seleniumeasy.steps;

import com.seleniumeasy.pages.CheckboxDemoPage;
import org.fluentlenium.core.annotation.Page;

public class CheckboxDemoStep {

  @Page CheckboxDemoPage checkBoxDemoPage;

  public void seleccionarCheckbox() {
    checkBoxDemoPage.seleccionarCheckbox();
  }

  public void validarMensajeMostradoPantalla(String mensaje) {
    checkBoxDemoPage.validarMensajeMostradoPantalla(mensaje);
  }
}
