package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static org.junit.Assert.*;


@DefaultUrl("https://www.demoqa.com/webtables")

public class RegisterUserPage extends PageObject {

    public By addNewRecordButton = By.id("addNewRecordButton");
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By userEmailInput = By.id("userEmail");
    public By ageInput = By.id("age");
    public By salaryInput = By.id("salary");
    public By departmentInput = By.id("department");
    public By submitButton = By.id("submit");

    public By firstNameValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[22]");
    public By lastNameValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[23]");
    public By emailValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[24]");
    public By ageValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[25]");
    public By salaryValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[26]");
    public By departmentValidation = By.xpath("(//div[@class='rt-td' and @role='gridcell'])[27]");

    public void clickAddNewRecordButton() {

        getDriver().findElement(addNewRecordButton).click();

    }

    public void sendFirstNameInput(String string) {
        getDriver().findElement(firstNameInput).sendKeys(string);
    }

    public void sendLastNameInput(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void sendUserEmailInput(String string) {
        getDriver().findElement(userEmailInput).sendKeys(string);
    }

    public void sendAgeInput(String string) {
        getDriver().findElement(ageInput).sendKeys(string);
    }

    public void sendSalaryInput(String string) {
        getDriver().findElement(salaryInput).sendKeys(string);
    }

    public void sendDepartmentInput(String string) {
        getDriver().findElement(departmentInput).sendKeys(string);
    }

    public void clickSubmitButton() {
        getDriver().findElement(submitButton).click();
    }

    public void Validations(String expectedName,String expectedLastName, String expectedEmail, String expectedAge,
                            String expectedSalary, String expectedDepartment){

        assertEquals(getDriver().findElement(firstNameValidation).getText(),expectedName);
        assertEquals(getDriver().findElement(lastNameValidation).getText(),expectedLastName);
        assertEquals(getDriver().findElement(ageValidation).getText(),expectedAge);
        assertEquals(getDriver().findElement(emailValidation).getText(),expectedEmail);
        assertEquals(getDriver().findElement(salaryValidation).getText(),expectedSalary);
        assertEquals(getDriver().findElement(departmentValidation).getText(),expectedDepartment);
    }
}
