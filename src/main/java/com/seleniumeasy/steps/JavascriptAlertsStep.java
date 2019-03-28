package com.seleniumeasy.steps;

import com.seleniumeasy.pages.JavascriptAlertsPage;
import org.fluentlenium.core.annotation.Page;

public class JavascriptAlertsStep {

    @Page JavascriptAlertsPage javascriptAlertsPage;

    public void ingresoNombrePromptAlert(String nombre){
        javascriptAlertsPage.activarPromptAlert();
        javascriptAlertsPage.ingresarNombrePromptAlert(nombre);
    }
}
