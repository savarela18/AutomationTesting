package com.advantageshopping.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.waits.WithTimeout;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.ServerConnectionStatistics;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class RegisterNewUserStepDefinitions {

    public WebDriver driver;

    String user = "AutoTesting3";
    String password="2190Qwop";
    String email= "Auto.Test3@gmail.com";


    @Given("^that a web user wants to register in advantage shopping online$")
    public void thatAWebUserWantsToRegisterInAdvantageShoppingOnline() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.advantageonlineshopping.com/#/register");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields()  {

        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        assertEquals(driver.findElement(By.xpath("//h3[text()='CREATE ACCOUNT']")).getText(),"CREATE ACCOUNT");
        driver.findElement(By.name("usernameRegisterPage")).sendKeys(user);
        driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(password);
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(password);
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Automation");
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Test");
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3211233212");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("France");
        //Select country = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
        //country.selectByVisibleText("France");
        driver.findElement(By.name("cityRegisterPage")).sendKeys("titiribi");
        driver.findElement(By.name("addressRegisterPage")).sendKeys("Calle 123 #32-12");
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Antioquia");
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("5010501");
        driver.findElement(By.name("i_agree")).click();
        assertTrue(driver.findElement(By.id("register_btnundefined")).isEnabled());
        driver.findElement(By.id("register_btnundefined")).click();

        }

    @Then("^he should see him username in the homepage$")
    public void heShouldSeeHimUsernameInTheHomepage() throws InterruptedException {

        driver.get("http://advantageonlineshopping.com/#/");
        WebDriverWait explicitwait = new WebDriverWait(driver,10);
        WebElement menuUser;
        menuUser= explicitwait.until(ExpectedConditions.elementToBeClickable(By.id("menuUserLink")));
        driver.findElement(By.id("menuUserLink")).click();
        assertTrue(driver.findElement(By.xpath("//*[@class='PopUp']")).isDisplayed());
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        assertTrue(driver.findElement(By.id("sign_in_btnundefined")).isEnabled());

        FluentWait fluentWait = new FluentWait<WebDriver>(driver);
                fluentWait.withTimeout(3,TimeUnit.SECONDS);
                fluentWait.pollingEvery(500,TimeUnit.MILLISECONDS);
                fluentWait.ignoring(Exception.class);

                fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));

        driver.findElement(By.id("sign_in_btnundefined")).click();
        assertEquals(driver.findElement(By.xpath("//*[@class='hi-user containMiniTitle ng-binding']")).getText(),user);
        driver.quit();
    }

}
