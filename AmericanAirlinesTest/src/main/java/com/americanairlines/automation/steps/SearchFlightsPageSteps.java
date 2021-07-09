package com.americanairlines.automation.steps;

import com.americanairlines.automation.pageobjects.SearchFlightsPage;
import com.americanairlines.automation.utils.JavascriptClick;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class SearchFlightsPageSteps {
    SearchFlightsPage searchFlightsPage = new SearchFlightsPage();

    @Step
    public void OpenBrowser (){
        searchFlightsPage.open();
    }

    @Step
    public void FillAllInfo(){
    searchFlightsPage.setOriginCityInput("MDE");
    searchFlightsPage.setDestinationCityInput("BOS");
    searchFlightsPage.setTravelDateInput("10/10/2021");
    searchFlightsPage.setTravelTimeSelect("Early Morning");
    searchFlightsPage.setTravelReturnDateInput("10/11/2021");
    searchFlightsPage.setTravelReturnTimeSelect("All day");
    searchFlightsPage.setPassengerCountSelect("2");
    searchFlightsPage.setPassengerTypeSelect("Adult (16-64)");
    searchFlightsPage.setSearchFlightButton();

    searchFlightsPage.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    searchFlightsPage.setFlightSelection();
    searchFlightsPage.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        JavascriptClick.clickJS(searchFlightsPage.getDriver(),searchFlightsPage.ReturnFlightSelection);

    }

    @Step
    public void Validations(){
        searchFlightsPage.Validations("Medellin, Colombia","Boston, MA");

    }
}
