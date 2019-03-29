package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;

public class JavascriptAlertsPage extends PageObject {

  @FindBy(xpath = ".//button[contains(text(),'Click for Prompt Box')]")
  private WebElementFacade btnPromptAlert;

  @FindBy(xpath = ".//p[@id='prompt-demo']")
  private WebElementFacade lblMensaje;

  Utilidades utilidades;

  public void activarPromptAlert() {
    btnPromptAlert.waitUntilVisible();
    btnPromptAlert.waitUntilClickable().click();
  }

  public void ingresarNombrePromptAlert(String palabra) {
    Alert alerta = getAlert();
    alerta.sendKeys(palabra);
    alerta.accept();
  }

  public void validarMensaje(String palabra) {
    String mensajeEsperadoPantalla = "You have entered '" + palabra + "' !";
    utilidades.compararResultado(lblMensaje, mensajeEsperadoPantalla);
  }
}
