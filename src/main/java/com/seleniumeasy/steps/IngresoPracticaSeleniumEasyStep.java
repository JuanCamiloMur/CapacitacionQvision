package com.seleniumeasy.steps;

import com.seleniumeasy.pages.IngresoPracticaSeleniumEasyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class IngresoPracticaSeleniumEasyStep {

    @Page
    IngresoPracticaSeleniumEasyPage ingresoPracticaSeleniumEasyPage;

    @Step
    public void abrirSeleniumEasy () {
        ingresoPracticaSeleniumEasyPage.open();
    }

    @Step
    public void ingresarPractica (String practica){
        ingresoPracticaSeleniumEasyPage.iniciarPractica();
        ingresoPracticaSeleniumEasyPage.seleccionarPractica(practica);
    }
}
