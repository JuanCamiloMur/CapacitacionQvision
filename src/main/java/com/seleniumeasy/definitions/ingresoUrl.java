package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.IngresoPracticaSeleniumEasyStep;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ingresoUrl {

    @Steps
    IngresoPracticaSeleniumEasyStep ingresoPracticaSeleniumEasyStep;

    @Before("@seleniumeasy")
    public void ingresarSeleniumEasy () throws IOException {
        ingresoPracticaSeleniumEasyStep.abrirSeleniumEasy();
    }
}
