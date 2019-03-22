package com.seleniumeasy.pages.camposTexto;

import com.seleniumeasy.utils.EnumNumeros;
import com.seleniumeasy.utils.EnumVariablesSesion;
import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.Enumeration;
import java.util.Random;

public class PracticaCamposTextoPage extends PageObject {

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

    Utilidades utilidades;

    Random random = new Random();

    public void ingresarMensaje(String mensaje){
        txtMensaje.waitUntilVisible();
        txtMensaje.sendKeys(mensaje);
        Serenity.setSessionVariable(EnumVariablesSesion.RESULTADO_ESPERADO.getValor()).to(mensaje);
    }

    public void enviarMensaje(){
        btnEnviarMensaje.waitUntilClickable().click();
    }

    public void ingresarPrimerNumero(){
        this.primerNumero = random.nextInt(Integer.valueOf(EnumNumeros.NUMERO_100.getValor()));
        txtPrimerNumero.waitUntilVisible();
        txtPrimerNumero.sendKeys(Integer.toString(primerNumero));
    }

    public void ingresarSegundoNumero(){
        this.segundoNumero = random.nextInt(Integer.valueOf(EnumNumeros.NUMERO_100.getValor()));
        txtSegundoNumero.waitUntilVisible();
        txtSegundoNumero.sendKeys(Integer.toString(segundoNumero));
    }

    public void obtenerTotalSuma(){
        int suma = primerNumero + segundoNumero;
        Serenity.setSessionVariable(EnumVariablesSesion.RESULTADO_ESPERADO.getValor()).to(Integer.toString(suma));
        btnSumar.waitUntilClickable();
        btnSumar.click();
    }

    public void validarResultadoMensaje (String operadorLogico){
        utilidades.compararResultado(lblResultadoMensaje,
                Serenity.sessionVariableCalled(EnumVariablesSesion.RESULTADO_ESPERADO.getValor()),operadorLogico);
    }

    public void validarResultadoSuma (String operadorLogico){
        utilidades.compararResultado(lblResultadoSuma,
                Serenity.sessionVariableCalled(EnumVariablesSesion.RESULTADO_ESPERADO.getValor()),operadorLogico);
    }


}
