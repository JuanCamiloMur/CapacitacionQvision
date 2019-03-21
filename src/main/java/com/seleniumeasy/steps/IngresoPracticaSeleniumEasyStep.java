package com.seleniumeasy.steps;

import com.seleniumeasy.pages.IngresoPracticaSeleniumEasyPage;
import com.seleniumeasy.utils.EnumEjercicios;
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
    public void ingresarPracticaCamposTexto (){
        ingresoPracticaSeleniumEasyPage.iniciarPractica();
        ingresoPracticaSeleniumEasyPage.seleccionarPractica(EnumEjercicios.INPUT_FORMS.getValor());
    }
}
