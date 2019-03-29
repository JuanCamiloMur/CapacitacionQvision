package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.DataTableSearchStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class DataTableSearchDefinition {

  @Steps DataTableSearchStep dataTableSearchStep;

  @Cuando("^busco la tarea: (.*)$")
  public void buscarTareaTabla(String tarea) {
    dataTableSearchStep.buscarDato(tarea);
  }

  @Entonces("^me debe aparecer los siguientes datos en la tabla: (.*)$")
  public void validarDatosTablaTask(String tarea) {
    dataTableSearchStep.validarDatosTablaTask(tarea);
  }

  @Cuando("^busco el usuario: (.*)$")
  public void buscarUsuario(String usuario) {
    dataTableSearchStep.buscarFiltroUsuario(usuario);
  }

  @Entonces("^me debe aparecer los datos del usuario: (.*)$")
  public void validarDatosTablaUsuario(String usuario) {
    dataTableSearchStep.validarDatosTablaUsuario(usuario);
  }
}
