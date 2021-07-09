import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ElementScreenShot {

    public Screenshot captureElementScreen(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//table[@border='0' and @height='100%']"));
        Screenshot Fullscreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);
        try {
            ImageIO.write(Fullscreenshot.getImage(), "jpg", new File("C:\\Element.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Fullscreenshot;
    }
}
