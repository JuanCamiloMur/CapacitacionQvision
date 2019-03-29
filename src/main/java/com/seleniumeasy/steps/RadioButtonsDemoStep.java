package com.seleniumeasy.steps;

import com.seleniumeasy.pages.RadioButtonsDemoPage;
import org.fluentlenium.core.annotation.Page;

public class RadioButtonsDemoStep {

  @Page RadioButtonsDemoPage radioButtonsDemoPage;

  public void seleccionarRadioButtons(String genero) {
    radioButtonsDemoPage.selecionarRadioBoton(genero);
  }

  public void validarMensajeMostradoPantalla(String genero) {
    radioButtonsDemoPage.validarMensajeValidacion(genero);
  }
}
