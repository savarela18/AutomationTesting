package com.demoqa.automation.pageobjects;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.*;

import java.util.Locale;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class FormRegisterPage extends PageObject {

    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By genderRatioClick = By.id("gender-radio-1");
    public By userNumberInput = By.id("userNumber");
    public By dateOfBirthInput = By.id("dateOfBirthInput");
    public By subjectsContainerInput = By.id("subjectsInput");
    public By hobbiesCheckCLick = By.id("hobbies-checkbox-3");
    public By uploadPictureClick = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.id("react-select-3-input");
    public By cityInput = By.id("react-select-4-input");
    public By submitClick = By.id("submit");

    public By firstNameInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[2]");
    public By userEmailInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[4]");
    public By genderRatioClickValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[6]");
    public By userNumberInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[8]");
    public By dateOfBirthInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[10]");
    public By subjectsContainerInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[12]");
    public By hobbiesCheckCLickValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[14]");
    public By uploadPictureValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[16]");
    public By currentAddressInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[18]");
    public By StateAndCityInputValidation = By.xpath("(//table[@class='table table-dark table-striped table-bordered table-hover']//tr//td)[20]");

    public void sendFirstNameInput(String string) {
        getDriver().findElement(firstNameInput).sendKeys(string);
    }

    public void sendLastNameInput(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void sendUserEmailInput(String string) {
        getDriver().findElement(userEmailInput).sendKeys(string);
    }

    public void sendUserNumberInput(String string) {
        getDriver().findElement(userNumberInput).sendKeys(string);
    }

    public void setUploadPictureClick(String string) {
       getDriver().findElement(uploadPictureClick).sendKeys(string);
    }

    public void sendDateOfBirthInput(String string) {
        getDriver().findElement(dateOfBirthInput).sendKeys(Keys.chord(Keys.CONTROL,"a"),string,Keys.ENTER);

    }

    public void sendSubjectsContainerInput(String string) {
        getDriver().findElement(subjectsContainerInput).sendKeys(string);
        getDriver().findElement(subjectsContainerInput).sendKeys(Keys.ENTER);
    }

    public void sendCurrentAddressInput(String string) {
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }

    public void sendStateInput(String string) {
        getDriver().findElement(stateInput).sendKeys(string,Keys.TAB);
    }

    public void sendCityInput(String string) {
        getDriver().findElement(cityInput).sendKeys(string,Keys.TAB);
    }


    public void Validations(String expectedName, String expectedEmail, String expectedGender, String expectedNumber,
                            String expectedBirthDay,String expectedSubject, String expectedHobbies, String expectedFile,
                            String expectedAddress, String expectedStateAndCity) {
        assertEquals(getDriver().findElement(firstNameInputValidation).getText(),expectedName);
        assertEquals(getDriver().findElement(userEmailInputValidation).getText(),expectedEmail);
        assertEquals(getDriver().findElement(genderRatioClickValidation).getText(),expectedGender);
        assertEquals(getDriver().findElement(userNumberInputValidation).getText(),expectedNumber);
        assertEquals(getDriver().findElement(dateOfBirthInputValidation).getText(),expectedBirthDay);
        assertEquals(getDriver().findElement(subjectsContainerInputValidation).getText(),expectedSubject);
        assertEquals(getDriver().findElement(hobbiesCheckCLickValidation).getText(),expectedHobbies);
        assertEquals(getDriver().findElement(uploadPictureValidation).getText(),expectedFile);
        assertEquals(getDriver().findElement(currentAddressInputValidation).getText(),expectedAddress);
        assertEquals(getDriver().findElement(StateAndCityInputValidation).getText(),expectedStateAndCity);

    }
}
