package com.seleniumeasy.steps.camposTexto;

import com.seleniumeasy.pages.camposTexto.PracticaCamposTextoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PracticaCamposTextoStep {

    @Page PracticaCamposTextoPage practicaCamposTextoPage;

    @Step
    public void enviarMensaje (String mensaje) {
        practicaCamposTextoPage.ingresarMensaje(mensaje);
        practicaCamposTextoPage.enviarMensaje();
    }

    @Step
    public void validarMensaje(String operadorLogico){
        practicaCamposTextoPage.validarResultadoMensaje(operadorLogico);
    }

    @Step
    public void sumarNumerosEnteros(){
        practicaCamposTextoPage.ingresarPrimerNumero();
        practicaCamposTextoPage.ingresarSegundoNumero();
        practicaCamposTextoPage.obtenerTotalSuma();
    }

    @Step
    public void validarSuma(String operadorLogico){
        practicaCamposTextoPage.validarResultadoSuma(operadorLogico);
    }
}
