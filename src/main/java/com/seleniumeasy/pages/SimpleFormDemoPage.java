package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemoPage extends PageObject {

  @FindBy(xpath = ".//input[@id='user-message']")
  private WebElementFacade txtMensaje;

  @FindBy(xpath = ".//button[contains(text(),'Show Message')]")
  private WebElementFacade btnEnviarMensaje;

  @FindBy(xpath = ".//span[@id='display']")
  private WebElementFacade lblResultadoMensaje;

  @FindBy(xpath = ".//form[@id='gettotal']")
  private WebElementFacade contenedorTxtNumerosSuma;

  @FindBy(xpath = ".//button[contains(text(),'Get Total')]")
  private WebElementFacade btnSumar;

  @FindBy(xpath = ".//span[@id='displayvalue']")
  private WebElementFacade lblResultadoSuma;

  private int suma;

  Utilidades utilidades;

  public void ingresarMensaje(String mensaje) {
    txtMensaje.waitUntilVisible();
    txtMensaje.sendKeys(mensaje);
  }

  public void enviarMensaje() {
    btnEnviarMensaje.waitUntilClickable().click();
  }

  public void ingresarNumeros(String numeros, int numId) {
    WebElementFacade txtNumero =
        contenedorTxtNumerosSuma.findBy(By.xpath(".//input[@id='sum" + numId + "']"));
    txtNumero.sendKeys(numeros);
    this.suma += Integer.parseInt(numeros);
  }

  public void obtenerTotalSuma() {
    btnSumar.waitUntilClickable();
    btnSumar.click();
  }

  public void validarResultadoMensaje(String mensaje) {
    utilidades.compararResultado(lblResultadoMensaje, mensaje);
  }

  public void validarResultadoSuma() {
    String valorEsperado = Integer.toString(suma);
    utilidades.compararResultado(lblResultadoSuma, valorEsperado);
  }
}
