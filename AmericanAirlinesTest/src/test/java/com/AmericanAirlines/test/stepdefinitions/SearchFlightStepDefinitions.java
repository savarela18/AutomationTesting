package com.AmericanAirlines.test.stepdefinitions;

import com.americanairlines.automation.steps.SearchFlightsPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchFlightStepDefinitions {

    @Steps
    SearchFlightsPageSteps  searchFlightsPageSteps;

    @Given("^open the browser in the airline page$")
    public void openTheBrowserInTheAirlinePage() {
        searchFlightsPageSteps.OpenBrowser();

    }


    @When("^Fill the requested information$")
    public void fillTheRequestedInformation() {
        searchFlightsPageSteps.FillAllInfo();
    }

    @Then("^Verify the information$")
    public void verifyTheInformation() {
        searchFlightsPageSteps.Validations();
    }
}
