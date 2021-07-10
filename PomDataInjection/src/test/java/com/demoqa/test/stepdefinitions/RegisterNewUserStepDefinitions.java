package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.RegisterNewUserPageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterNewUserStepDefinitions {

    @Steps
    RegisterNewUserPageStep registerNewUserPageStep;

    @Given("^Open the browser in WebTables Demoqa app$")
    public void openTheBrowserInWebTablesDemoqaApp() {
        registerNewUserPageStep.OpenBrowser();
    }


    @When("^Fill all the requested info$")
    public void fillAllTheRequestedInfo() {
        //registerNewUserPageStep.FillTheRequiredInfo();
        registerNewUserPageStep.FillTheInfoWithExcel();
    }

    @Then("^Verify the date injected in the table bellow$")
    public void verifyTheDateInjectedInTheTableBellow() {
        //registerNewUserPageStep.Validations();
        registerNewUserPageStep.ValidationsWithExcel();
    }
}
