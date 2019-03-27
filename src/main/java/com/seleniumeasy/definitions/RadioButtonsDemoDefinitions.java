package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.RadioButtonsDemoStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsDemoDefinitions {

    @Steps RadioButtonsDemoStep radioButtonsDemoStep;

    @Cuando("^selecciono el Radio Button (.*)$")
    public void seleccionarRadioButton(String boton) {
        radioButtonsDemoStep.seleccionarRadioButtons(boton);
    }

    @Entonces("^debe mostrar el siguiente mesaje: (.*)$")
    public void MesajeValidacion(String mensaje) {
        radioButtonsDemoStep.validarMensajeMostradoPantalla(mensaje);
    }
}
