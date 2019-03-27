package com.seleniumeasy.definitions;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

public class DataTableSearchDefinitions {

    @Cuando("^busco la tarea: (.*)$")
    public void buscarTareaTabla(String tarea)   {

    }

    @Entonces("^me debe aparecer solo la tarea: (.*) en la tabla$")
    public void validacionDatoTabla(String tarea)   {

    }
}
