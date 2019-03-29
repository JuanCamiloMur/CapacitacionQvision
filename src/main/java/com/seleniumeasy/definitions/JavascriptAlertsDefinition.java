package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.JavascriptAlertsStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class JavascriptAlertsDefinition {

    @Steps JavascriptAlertsStep javascriptAlertsStep;

    @Cuando("^ingreso el nombre: (.*) en el prompt box$")
    public void ingresoNombreAlertaJavascript(String nomnbre) {
        javascriptAlertsStep.ingresoNombrePromptAlert(nomnbre);
    }

    @Entonces("^debe aparecer un mensaje con el nombre: (.*)$")
    public void validacionNombre() throws Exception {

    }

}
