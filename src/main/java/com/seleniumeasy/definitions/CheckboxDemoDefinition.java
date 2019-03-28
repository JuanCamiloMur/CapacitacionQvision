package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.CheckboxDemoStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CheckboxDemoDefinition {

    @Steps
    CheckboxDemoStep checkBoxDemoStep;

    @Cuando("^selecciono el CheckBox$")
    public void seleccionarCheckbox(){
        checkBoxDemoStep.seleccionarCheckbox();
    }

    @Entonces("^me debe mostrar el mensaje (.*) en pantalla$")
    public void validarMensajeMostradoPantalla(String mensaje){
        checkBoxDemoStep.validarMensajeMostradoPantalla(mensaje);
    }
}
