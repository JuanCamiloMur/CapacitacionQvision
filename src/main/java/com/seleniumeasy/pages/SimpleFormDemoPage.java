package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemoPage extends PageObject {

    @FindBy (xpath = ".//input[@id='user-message']")
    private WebElementFacade txtMensaje;

    @FindBy (xpath = ".//button[contains(text(),'Show Message')]")
    private WebElementFacade btnEnviarMensaje;

    @FindBy (xpath = ".//span[@id='display']")
    private WebElementFacade lblResultadoMensaje;

    @FindBy (xpath = ".//input[@id='sum1']")
    private WebElementFacade txtPrimerNumero;

    @FindBy (xpath = ".//input[@id='sum2']")
    private WebElementFacade txtSegundoNumero;

    @FindBy (xpath = ".//button[contains(text(),'Get Total')]")
    private WebElementFacade btnSumar;

    @FindBy (xpath = ".//span[@id='displayvalue']")
    private WebElementFacade lblResultadoSuma;

    private int primerNumero;
    private int segundoNumero;
    private int suma;

    Utilidades utilidades;

    public void ingresarMensaje(String mensaje){
        txtMensaje.waitUntilVisible();
        txtMensaje.sendKeys(mensaje);
    }

    public void enviarMensaje(){
        btnEnviarMensaje.waitUntilClickable().click();
    }

    public void ingresarPrimerNumero(String numero){
        txtPrimerNumero.waitUntilVisible();
        txtPrimerNumero.sendKeys(numero);
        this.primerNumero = Integer.parseInt(numero);
    }

    public void ingresarSegundoNumero(String numero){
        txtSegundoNumero.waitUntilVisible();
        txtSegundoNumero.sendKeys(numero);
        this.segundoNumero = Integer.parseInt(numero);
    }

    public void obtenerTotalSuma(){
        this.suma = primerNumero + segundoNumero;
        btnSumar.waitUntilClickable();
        btnSumar.click();
    }

    public void validarResultadoMensaje (String mensaje){
        utilidades.compararResultado(lblResultadoMensaje,mensaje);
    }

    public void validarResultadoSuma (){
        String valorEsperado = Integer.toString(suma);
        utilidades.compararResultado(lblResultadoSuma, valorEsperado);
    }


}
