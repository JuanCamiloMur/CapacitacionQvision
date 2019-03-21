package com.seleniumeasy.definitions.camposTexto;

import com.seleniumeasy.steps.IngresoPracticaSeleniumEasyStep;
import com.seleniumeasy.steps.camposTexto.PracticaCamposTextoStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PracticaCamposTextoDefinition {

    @Steps IngresoPracticaSeleniumEasyStep ingresoPracticaSeleniumEasyStep;

    @Steps PracticaCamposTextoStep practicaCamposTextoStep;

    @Cuando("^envio el mensaje (.*)$")
    public void envioMensaje(String mensaje) throws Exception {
        ingresoPracticaSeleniumEasyStep.ingresarPracticaCamposTexto();
        practicaCamposTextoStep.enviarMensaje(mensaje);
    }


    @Entonces("^el mensaje debe ser enviado correctamente$")
    public void validacionMensajeEnviadoCorrectamente() throws Exception {
        practicaCamposTextoStep.validarMensajeEnviado();
    }

}
