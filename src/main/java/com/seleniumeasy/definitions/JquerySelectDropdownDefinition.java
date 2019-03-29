package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.JquerySelectDropdownStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.thucydides.core.annotations.Steps;

public class JquerySelectDropdownDefinition {

  @Steps JquerySelectDropdownStep jquerySelectDropdownStep;

  private List<String> estadosNorteamerica;

  @Cuando("^selecciono tres estados de norteamerica$")
  public void seleccionarEstadosNorteamerica(DataTable estados) {
    this.estadosNorteamerica = estados.asList(String.class);
    jquerySelectDropdownStep.seleccionarEstados(estadosNorteamerica);
  }

  @Entonces("^deben estar visibles los estados antes seleccionados$")
  public void validarEstadosNorteamericanos() {
    jquerySelectDropdownStep.validarEstadosSeleccionados(estadosNorteamerica);
  }
}
