package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class RadioButtonsDemoPage extends PageObject {

  @FindBy(xpath = ".//*[@id='easycont']/div/div[2]/div[1]/div[2]")
  private WebElementFacade contenedorRbtDemo;

  @FindBy(xpath = ".//p[@class='radiobutton']")
  private WebElementFacade lblMensajeValidacion;

  @FindBy(id = "buttoncheck")
  private WebElementFacade btnVerificarValor;

  Utilidades utilidades;

  public void selecionarRadioBoton(String genero) {
    contenedorRbtDemo
        .findBy(By.xpath("//label[contains(text(),'" + genero + "')]"))
        .waitUntilClickable()
        .click();
    btnVerificarValor.waitUntilClickable().click();
  }

  public void validarMensajeValidacion(String genero) {
    String mensajeMostrado = "Radio button '" + genero + "' is checked";
    utilidades.compararResultado(lblMensajeValidacion, mensajeMostrado);
  }
}
