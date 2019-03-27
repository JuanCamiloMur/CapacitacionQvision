package com.seleniumeasy.pages;

import com.seleniumeasy.utils.Utilidades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class DataTableSearchPage extends PageObject {

    @FindBy (xpath = ".//input[@id='task-table-filter']")
    private WebElementFacade txtBusqueda;

    @FindBy (xpath = ".//table[@id='task-table']//tr[not(contains(@style,'display: none;'))]/td[2]")
    private WebElementFacade tblTask;

    @FindBy (xpath = ".//table[@class='table']//tr[not(contains(@style,'display: none;'))]/td[2]")
    private WebElementFacade tblListaUsuario;

    @FindBy (xpath = ".//div[@class='pull-right']/button")
    private WebElementFacade btnFiltro;

    @FindBy (xpath = ".//input[@placeholder='Username']")
    private WebElementFacade txtFiltroUsuario;

    Utilidades utilidades;

    public void buscarTarea(String tarea){
        txtBusqueda.waitUntilVisible();
        txtBusqueda.sendKeys(tarea);
    }

    public void validarDatosTablaTask(String tarea){
        utilidades.compararResultado(tblTask,tarea);
    }

    public void activarFiltros(){
        btnFiltro.waitUntilVisible();
        btnFiltro.waitUntilClickable().click();
    }

    public void busquedaFiltro(String usuario){
        txtFiltroUsuario.waitUntilClickable();
        txtFiltroUsuario.sendKeys(usuario);
    }

    public void validarDatosTablaUsuario(String usuario){
        utilidades.compararResultado(tblListaUsuario,usuario);
    }
}
