package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SelectDropdownListPage extends PageObject {

  @FindBy(xpath = ".//select[@class='form-control']")
  private WebElementFacade cmbDiaSemana;

  @FindBy(xpath = ".//p[@class='selected-value']")
  private WebElementFacade lblMensajeDiaSemana;

  Utilidades utilidades;

  public void seleccionarDiaSemana(String dia) {
    cmbDiaSemana.waitUntilVisible();
    cmbDiaSemana.selectByValue(dia);
  }

  public void validarMensajeDiaSemana(String dia) {
    String mensajeMostrado = "Day selected :- " + dia + "";
    utilidades.compararResultado(lblMensajeDiaSemana, mensajeMostrado);
  }
}
