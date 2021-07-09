import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.demoqa.com/webtables");
        JavaScriptZoom.Zoom(driver);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        By AddButton = By.id("addNewRecordButton");
        JavaScriptClick.clickJS(driver,AddButton);
        driver.findElement(By.id("firstName")).sendKeys("Hollow");
        driver.findElement(By.id("lastName")).sendKeys("Knight");
        driver.findElement(By.id("userEmail")).sendKeys("HollowKnight@gmail.com");
        driver.findElement(By.id("age")).sendKeys("23");
        driver.findElement(By.id("salary")).sendKeys("123155545");
        driver.findElement(By.id("department")).sendKeys("Innovation");
        By SubmitButton = By.id("submit");
        JavaScriptClick.clickJS(driver,SubmitButton);
        JavaScriptScroll.Scroll(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.quit();
    }
}
