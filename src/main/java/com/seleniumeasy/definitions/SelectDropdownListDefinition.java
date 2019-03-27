package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.SelectDropdownListStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SelectDropdownListDefinition {

    @Steps SelectDropdownListStep selectDropdownListStep;

    @Cuando("^seleciono el dia: (.*)$")
    public void selecionarDia(String dia) {
        selectDropdownListStep.seleccionarDiaSemana(dia);
    }

    @Entonces("^debe mostrar el dia seleccionado: (.*)$")
    public void validarMensajeDiaSeleccionado(String mensaje) {

    }
}
