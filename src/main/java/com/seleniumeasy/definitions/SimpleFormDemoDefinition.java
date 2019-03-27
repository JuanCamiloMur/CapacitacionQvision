package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.IngresoPracticaSeleniumEasyStep;
import com.seleniumeasy.steps.SimpleFormDemoStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SimpleFormDemoDefinition {

    @Steps IngresoPracticaSeleniumEasyStep ingresoPracticaSeleniumEasyStep;

    @Steps
    SimpleFormDemoStep simpleFormDemoStep;

    @Dado("^ingreso a la practica (.*)$")
    public void realizarPractica (String practica) {
        ingresoPracticaSeleniumEasyStep.ingresarPractica(practica);
    }

    @Cuando("^ingreso los numeros: (.*), (.*)$")
    public void sumaEnteros(String primerNumero, String segundoNumero) {
        simpleFormDemoStep.sumarNumerosEnteros(primerNumero, segundoNumero);
    }

    @Cuando("^envio el mensaje (.*)$")
    public void envioMensaje(String mensaje)  {
        simpleFormDemoStep.enviarMensaje(mensaje);
    }

    @Entonces("^el mensaje (.*) debe mostrase en pantalla$")
    public void validacionMensajeEnviadoCorrectamentePantalla(String mensaje)  {
        simpleFormDemoStep.validarMensaje(mensaje);
    }

    @Entonces("^el resultado debe mostrase en pantalla$")
    public void validacionResultadoCorrectamentePantalla()  {
        simpleFormDemoStep.validarSuma();
    }

}
