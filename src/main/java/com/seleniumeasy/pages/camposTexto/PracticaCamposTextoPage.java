package com.seleniumeasy.pages.camposTexto;

import com.seleniumeasy.utils.EnumVariablesSesion;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.FindBy;

public class PracticaCamposTextoPage extends PageObject {

    @FindBy (xpath = ".//input[@id='user-message']")
    private WebElementFacade txtMensaje;

    @FindBy (xpath = ".//button[contains(text(),'Show Message')]")
    private WebElementFacade btnEnviarMensaje;

    @FindBy (xpath = ".//span[@id='display']")
    private WebElementFacade lblResultado;

    public void ingresarMensaje(String mensaje){
        txtMensaje.waitUntilVisible();
        txtMensaje.sendKeys(mensaje);
        Serenity.setSessionVariable(EnumVariablesSesion.MENSAJE.getValor()).to(mensaje);
    }

    public void enviarMensaje(){
        btnEnviarMensaje.waitUntilClickable().click();
    }

    public void validarMensaje (){
        String mensaje = Serenity.sessionVariableCalled(EnumVariablesSesion.MENSAJE.getValor());
        lblResultado.waitUntilVisible();
        MatcherAssert.assertThat("El mensaje no es el correcto",lblResultado.getText()!=mensaje);
    }
}
