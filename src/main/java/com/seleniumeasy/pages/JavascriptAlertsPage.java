package com.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
public class JavascriptAlertsPage extends PageObject {

    @FindBy(xpath = ".//button[contains(text(),'Click for Prompt Box')]")
    private WebElementFacade btnPromptAlert;


    public void activarPromptAlert(){
        btnPromptAlert.waitUntilVisible();
        btnPromptAlert.waitUntilClickable().click();
    }

    public void ingresarNombrePromptAlert(String nombre){

    }

}
