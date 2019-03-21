package com.seleniumeasy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.seleniumeasy.com/test/")
public class IngresoPracticaSeleniumEasyPage extends PageObject {

    @FindBy (xpath = ".//a[contains(text(),'Start Practising')]")
    private WebElementFacade btnIniciarPractica;

    @FindBy (xpath = ".//div[@class='board']")
    private WebElementFacade tblPractica;

    public IngresoPracticaSeleniumEasyPage(WebDriver wdriver) {
        super(wdriver);
    }

    public void iniciarPractica (){
        tblPractica.waitUntilVisible();
        btnIniciarPractica.waitUntilClickable().click();
    }

    public void seleccionarPractica (String practica){
        tblPractica.findBy(By.linkText(practica))
                .waitUntilClickable()
                .click();
    }

}
