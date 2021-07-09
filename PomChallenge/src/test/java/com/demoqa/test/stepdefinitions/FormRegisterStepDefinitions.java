package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.FormRegisterPageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FormRegisterStepDefinitions {

    @Steps
    FormRegisterPageStep formRegisterPageStep;
    @Given("^that a web user wants to practice with forms in demoQa$")
    public void thatAWebUserWantsToPracticeWithFormsInDemoQa() {
    formRegisterPageStep.openBrowser();
    }


    @When("^he fills all the requested fields in form section$")
    public void heFillsAllTheRequestedFieldsInFormSection() throws Exception {
    formRegisterPageStep.FillFormRegisterPage();
    }

    @Then("^he should see him data in the Thanks for submitting form$")
    public void heShouldSeeHimDataDown() {
        formRegisterPageStep.Validation();
    }
}
