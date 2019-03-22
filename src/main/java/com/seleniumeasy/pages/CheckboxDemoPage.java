package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckboxDemoPage extends Utilidades {

    @FindBy (xpath = ".//input[@id='isAgeSelected']")
    private WebElementFacade chkMensaje;

    @FindBy (xpath = ".//div[@id='txtAge']")
    private WebElementFacade lblMensajePantalla;

    Utilidades utilidades;

    public void seleccionarCheckbox () {
        chkMensaje.waitUntilClickable();
        chkMensaje.click();
    }

    public void validarMensajeMostradoPantalla(String mensaje){
        utilidades.compararResultado(lblMensajePantalla,mensaje);
    }
}
