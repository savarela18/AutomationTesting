import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        TakeScreenShot screenShot = new TakeScreenShot();
        FullScreenShot fullScreenShot = new FullScreenShot();
        ElementScreenShot elementScreenShot = new ElementScreenShot();

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/index.php");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='register.php' and text()='REGISTER']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Jack");
        driver.findElement(By.name("lastName")).sendKeys("Murray");
        driver.findElement(By.name("phone")).sendKeys("8762818759");
        driver.findElement(By.id("userName")).sendKeys("JackMurr@ion.com");
        driver.findElement(By.name("address1")).sendKeys("70 Haddon St");
        driver.findElement(By.name("city")).sendKeys("Boston");
        driver.findElement(By.name("state")).sendKeys("Massachusetts");
        driver.findElement(By.name("postalCode")).sendKeys("02151");
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("UNITED STATES");
        driver.findElement(By.name("email")).sendKeys("JackMurray");
        driver.findElement(By.name("password")).sendKeys("123321123");
        driver.findElement(By.name("confirmPassword")).sendKeys("123321123");
        driver.findElement(By.name("submit")).click();
        screenShot.captureScreen(driver);
        fullScreenShot.captureFullScreen(driver);
        elementScreenShot.captureElementScreen(driver);
        
        driver.quit();
    }
}
