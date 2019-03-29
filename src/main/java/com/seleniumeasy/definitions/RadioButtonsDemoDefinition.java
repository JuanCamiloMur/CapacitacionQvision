package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.RadioButtonsDemoStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoDefinition {

  @Steps RadioButtonsDemoStep radioButtonsDemoStep;

  @Cuando("^selecciono el Radio Button (.*)$")
  public void seleccionarRadioButton(String genero) {
    radioButtonsDemoStep.seleccionarRadioButtons(genero);
  }

  @Entonces("^debe mostrar un mensaje con el genero seleecionado: (.*)$")
  public void mensajeValidacion(String genero) {
    radioButtonsDemoStep.validarMensajeMostradoPantalla(genero);
  }
}
