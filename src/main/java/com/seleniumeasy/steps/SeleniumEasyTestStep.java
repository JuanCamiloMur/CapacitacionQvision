package com.seleniumeasy.steps;

import com.seleniumeasy.pages.SeleniumEasyTestPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SeleniumEasyTestStep {

  @Page SeleniumEasyTestPage seleniumEasyTestPage;

  @Step
  public void abrirSeleniumEasy() {
    seleniumEasyTestPage.open();
  }

  @Step
  public void ingresarPractica(String practica) {
    seleniumEasyTestPage.iniciarPractica();
    seleniumEasyTestPage.seleccionarPractica(practica);
  }
}
