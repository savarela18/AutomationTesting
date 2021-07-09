package com.americanairlines.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;

@DefaultUrl("https://www.aa.com/booking/find-flights?tripType=roundTrip")

public class SearchFlightsPage extends PageObject {

    public By originCityInput = By.id("segments0.origin");
    public By destinationCityInput = By.id("segments0.destination");
    public By travelDateInput = By.id("segments0.travelDate");
    public By travelTimeSelect = By.id("segments0.travelTime");
    public By travelReturnDateInput = By.id("segments1.travelDate");
    public By travelReturnTimeSelect = By.id("segments1.travelTime");
    public By passengerCountSelect = By.id("passengerCount");
    public By passengerTypeSelect = By.id("passengers0.passengerType");
    public By searchFlightButton = By.id("flightSearchSubmitBtn");

    //SelectFlight
    public By FlightSelection = By.id("slice0Flight1MainCabin");
    public By ReturnFlightSelection = By.id("slice1Flight1MainCabin");

    //validation
    public By VerificationOriginCity = By.xpath("(//h3[@class='no-margin display-inline flight-details-summary-heading']//span[@class='hidden-phone'])[1]");
    public By VerificationDestinationCity = By.xpath("(//h3[@class='no-margin display-inline flight-details-summary-heading']//span[@class='hidden-phone'])[2]");

    public void setFlightSelection() {
        getDriver().findElement(FlightSelection).click();
    }

    public void setOriginCityInput(String string) {
    getDriver().findElement(originCityInput).sendKeys(Keys.chord(Keys.CONTROL+"a"),string);
    }

    public void setDestinationCityInput(String string) {
    getDriver().findElement(destinationCityInput).sendKeys(string);
    }

    public void setTravelDateInput(String string) {
    getDriver().findElement(travelDateInput).sendKeys(string);
    }

    public void setTravelTimeSelect(String string) {
        Select TravelTime = new Select(getDriver().findElement(travelTimeSelect));
        TravelTime.selectByVisibleText(string);
    }

    public void setTravelReturnDateInput(String string) {
        getDriver().findElement(travelReturnDateInput).sendKeys(string);
    }

    public void setTravelReturnTimeSelect(String string) {
        Select ReturnTime = new Select(getDriver().findElement(travelReturnTimeSelect));
        ReturnTime.selectByVisibleText(string);
    }

    public void setPassengerCountSelect(String string) {
        Select passenger = new Select(getDriver().findElement(passengerCountSelect));
        passenger.selectByVisibleText(string);
    }

    public void setPassengerTypeSelect(String string) {
        Select PassengerType = new Select(getDriver().findElement(passengerTypeSelect));
        PassengerType.selectByVisibleText(string);
    }

    public void setSearchFlightButton() {
        getDriver().findElement(searchFlightButton).click();
    }

    public void setReturnFlightSelection() {
        getDriver().findElement(ReturnFlightSelection).click();
    }

    public void Validations(String expectedOriginCity, String expectedDestinationCity){

        assertEquals(getDriver().findElement(VerificationOriginCity).getText(),expectedOriginCity);
        assertEquals(getDriver().findElement(VerificationDestinationCity).getText(),expectedDestinationCity);

    }
}
