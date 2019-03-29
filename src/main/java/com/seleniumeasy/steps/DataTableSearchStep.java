package com.seleniumeasy.steps;

import com.seleniumeasy.pages.DataTableSearchPage;
import org.fluentlenium.core.annotation.Page;

public class DataTableSearchStep {

    @Page DataTableSearchPage dataTableSearchPage;

    public void buscarDato(String tarea){
        dataTableSearchPage.buscarTarea(tarea);
    }

    public void validarDatosTablaTask(String tarea){
        dataTableSearchPage.validarDatosTablaTask(tarea);
    }

    public void buscarFiltroUsuario(String usuario){
        dataTableSearchPage.activarFiltros();
        dataTableSearchPage.busquedaFiltro(usuario);
    }

    public void validarDatosTablaUsuario(String usuario){
        dataTableSearchPage.validarDatosTablaUsuario(usuario);
    }

}
