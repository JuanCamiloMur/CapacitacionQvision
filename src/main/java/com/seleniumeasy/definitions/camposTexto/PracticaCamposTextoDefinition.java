package com.seleniumeasy.definitions.camposTexto;

import com.seleniumeasy.steps.IngresoPracticaSeleniumEasyStep;
import com.seleniumeasy.steps.camposTexto.PracticaCamposTextoStep;
import com.seleniumeasy.utils.EnumOperadoresLogicos;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class PracticaCamposTextoDefinition {

    @Steps IngresoPracticaSeleniumEasyStep ingresoPracticaSeleniumEasyStep;

    @Steps PracticaCamposTextoStep practicaCamposTextoStep;

    @Dado("^ingreso a la practica (.*)$")
    public void realizarPractica (String practica) {
        ingresoPracticaSeleniumEasyStep.ingresarPractica(practica);
    }

    @Cuando("^ingreso los numeros enteros$")
    public void sumaEnteros() {
        practicaCamposTextoStep.sumarNumerosEnteros();
    }

    @Cuando("^envio el mensaje (.*)$")
    public void envioMensaje(String mensaje)  {
        practicaCamposTextoStep.enviarMensaje(mensaje);
    }

    @Entonces("^el mensaje debe mostrase en pantalla$")
    public void validacionMensajeEnviadoCorrectamentePantalla()  {
        practicaCamposTextoStep.validarMensaje(EnumOperadoresLogicos.IGUAL.getValor());
    }

    @Entonces("^el resultado debe mostrase en pantalla$")
    public void validacionResultadoCorrectamentePantalla()  {
        practicaCamposTextoStep.validarSuma(EnumOperadoresLogicos.IGUAL.getValor());
    }

}
