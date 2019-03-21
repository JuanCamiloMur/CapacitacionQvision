package com.seleniumeasy.steps.camposTexto;

import com.seleniumeasy.pages.camposTexto.PracticaCamposTextoPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;

public class PracticaCamposTextoStep {

    @Page PracticaCamposTextoPage practicaCamposTextoPage;

    @Step
    public void enviarMensaje (String mensaje) {
        practicaCamposTextoPage.ingresarMensaje(mensaje);
        practicaCamposTextoPage.enviarMensaje();
    }

    @Step
    public void validarMensajeEnviado(){
        practicaCamposTextoPage.validarMensaje();
    }
}
