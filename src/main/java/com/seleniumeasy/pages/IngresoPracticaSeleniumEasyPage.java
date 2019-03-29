package com.seleniumeasy.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.seleniumeasy.com/test/")
public class IngresoPracticaSeleniumEasyPage extends PageObject {

    @FindBy (xpath = ".//a[contains(text(),'Start Practising')]")
    private WebElementFacade btnIniciarPractica;

    @FindBy (xpath = ".//div[@class='board']")
    private WebElementFacade tblPractica;

    @FindBy (xpath = ".//a[@id='btn_inter_example']")
    private WebElementFacade btnNivelIntermedio;

    @FindBy (xpath = ".//a[@id='btn_advanced_example']")
    private  WebElementFacade btnNivelAvanzado;

    @FindBy (xpath = ".//a[@id='btn_done_example']")
    private  WebElementFacade btnTerminado;

    public void iniciarPractica (){
        tblPractica.waitUntilVisible();
        btnIniciarPractica.waitUntilClickable().click();
    }

    public void seleccionarPractica (String practica){
        while(tblPractica.findElements(By.linkText(practica)).isEmpty()){
            if(btnNivelIntermedio.isVisible()){
                btnNivelIntermedio.waitUntilClickable().click();
            }else if(btnNivelAvanzado.isVisible()){
                btnNivelAvanzado.waitUntilClickable().click();
            }else{
                btnTerminado.waitUntilClickable().click();
            }
        }
        tblPractica.findBy(By.linkText(practica))
                .waitUntilClickable()
                .click();
    }

}
