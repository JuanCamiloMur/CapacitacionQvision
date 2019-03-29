package com.seleniumeasy.definitions;

import com.seleniumeasy.steps.SeleniumEasyTestStep;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;

public class SetupStory {

  @Steps SeleniumEasyTestStep seleniumEasyTestStep;

  @Before("@seleniumeasy")
  public void ingresarSeleniumEasy() {
    seleniumEasyTestStep.abrirSeleniumEasy();
  }
}
