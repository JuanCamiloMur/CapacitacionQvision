package com.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class JquerySelectDropdownPage extends PageObject {

  @FindBy(xpath = ".//input[@class='select2-search__field']")
  private WebElementFacade txtBusquedaEstados;

  @FindBy(xpath = ".//ul[@class='select2-selection__rendered']")
  private WebElementFacade contenedorEstadosSeleccionados;

  public void seleccionarEstadosNorteamerica(String estados) {
    txtBusquedaEstados.waitUntilVisible();
    txtBusquedaEstados.sendKeys(estados, Keys.ENTER);
  }

  public void validarEstadosNorteamerica(String estados) {
    WebElementFacade lblEstado =
        contenedorEstadosSeleccionados.findBy(By.xpath(".//li[@title='" + estados + "']"));
    lblEstado.waitUntilVisible();
  }
}
