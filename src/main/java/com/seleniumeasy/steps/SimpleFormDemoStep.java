package com.seleniumeasy.steps;

import com.seleniumeasy.pages.SimpleFormDemoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SimpleFormDemoStep {

    @Page
    SimpleFormDemoPage simpleFormDemoPage;

    @Step
    public void enviarMensaje (String mensaje) {
        simpleFormDemoPage.ingresarMensaje(mensaje);
        simpleFormDemoPage.enviarMensaje();
    }

    @Step
    public void validarMensaje(String mensaje){
        simpleFormDemoPage.validarResultadoMensaje(mensaje);
    }

    @Step
    public void sumarNumerosEnteros(String primerNumero, String segundoNumero){
        simpleFormDemoPage.ingresarPrimerNumero(primerNumero);
        simpleFormDemoPage.ingresarSegundoNumero(segundoNumero);
        simpleFormDemoPage.obtenerTotalSuma();
    }

    @Step
    public void validarSuma(){
        simpleFormDemoPage.validarResultadoSuma();
    }
}
