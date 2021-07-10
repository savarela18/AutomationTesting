package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.interactions.OpenBrowser;
import com.demoqa.automation.task.*;
import com.demoqa.automation.ui.RegisterFormPage;
import com.demoqa.automation.utils.Javascript;
import com.demoqa.automation.utils.ScreenShot;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.Screenshot;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterFormStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("admin").can(BrowseTheWeb.with(driver));

    }

    @After
    public void TakeScreen(){
        ScreenShot.takeScreenShot(driver);
    }

    @Given("^open the browser$")
    public void openTheBrowser() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.start(RegisterFormPage.URL));
        Javascript.Zoom(driver);
    }


    @When("^inject the data with excel in the fields$")
    public void injectTheDataWithExcelInTheFields() {

        theActorInTheSpotlight().attemptsTo(FillRegisterFormExcel.FillFormExcel());

    }

    @Then("^Validate the data with excel in the successful register form$")
    public void validateTheDataWithExcelInTheSuccessfulRegisterForm() {

        theActorInTheSpotlight().attemptsTo(RegisterFormValidationExcel.validationExcel());


    }

    @When("^inject the data with Config\\.Properties in the fields$")
    public void injectTheDataWithConfigPropertiesInTheFields() {

        theActorInTheSpotlight().attemptsTo(FillRegisterFormConfig.fillFormConfig());

    }

    @Then("^Validate the data with Config\\.Properties in the successful register form$")
    public void validateTheDataWithConfigPropertiesInTheSuccessfulRegisterForm() {
        theActorInTheSpotlight().attemptsTo(RegisterFormValidationConfig.ValidationConfig());

    }

    @When("^inject the data with Faker in the fields$")
    public void injectTheDataWithFakerInTheFields() {
        theActorInTheSpotlight().attemptsTo(FillRegisterFormFaker.FillFormFaker());

    }

    @Then("^Validate the data with Faker in the successful register form$")
    public void validateTheDataWithFakerInTheSuccessfulRegisterForm() {
        theActorInTheSpotlight().attemptsTo(RegisterFormValidationFaker.validationFaker());

    }
}
