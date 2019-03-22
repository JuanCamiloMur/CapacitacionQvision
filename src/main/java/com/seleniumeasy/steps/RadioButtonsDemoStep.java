package com.seleniumeasy.steps;

import com.seleniumeasy.pages.RadioButtonsDemoPage;
import org.fluentlenium.core.annotation.Page;

public class RadioButtonsDemoStep {

    @Page
    RadioButtonsDemoPage radioButtonsDemoPage;

    public void seleccionarRadioButtons(String boton){
        radioButtonsDemoPage.selecionarRadioBoton(boton);
    }

    public void validarMensajeMostradoPantalla(String mensaje){
        radioButtonsDemoPage.validarMensajeValidacion(mensaje);
    }
}
