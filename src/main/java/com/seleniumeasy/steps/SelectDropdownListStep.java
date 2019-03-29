package com.seleniumeasy.steps;

import com.seleniumeasy.pages.SelectDropdownListPage;
import org.fluentlenium.core.annotation.Page;

public class SelectDropdownListStep {

  @Page SelectDropdownListPage selectDropdownListPage;

  public void seleccionarDiaSemana(String dia) {
    selectDropdownListPage.seleccionarDiaSemana(dia);
  }

  public void validarDiaSeleccionado(String dia) {
    selectDropdownListPage.validarMensajeDiaSemana(dia);
  }
}
