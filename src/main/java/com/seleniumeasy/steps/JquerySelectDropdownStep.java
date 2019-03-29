package com.seleniumeasy.steps;

import com.seleniumeasy.pages.JquerySelectDropdownPage;
import java.util.List;
import org.fluentlenium.core.annotation.Page;

public class JquerySelectDropdownStep {

  @Page JquerySelectDropdownPage jquerySelectDropdownPage;

  public void seleccionarEstados(List<String> estadosNorteamerica) {
    estadosNorteamerica.forEach(
        estados -> jquerySelectDropdownPage.seleccionarEstadosNorteamerica(estados));
  }

  public void validarEstadosSeleccionados(List<String> estadosNorteamerica) {
    estadosNorteamerica.forEach(
        estados -> jquerySelectDropdownPage.validarEstadosNorteamerica(estados));
  }
}
