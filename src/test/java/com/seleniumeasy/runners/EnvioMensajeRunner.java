package com.seleniumeasy.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba_elementos_campos_texto.feature",
        glue = "com.seleniumeasy.definitions",
        tags = "@envio_mensaje"
)
public class EnvioMensajeRunner {
}
