import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class FullScreenShot {

    public Screenshot captureFullScreen(WebDriver driver) {

        Screenshot Fullscreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(Fullscreenshot.getImage(), "jpg", new File("C:\\screenshotFull.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Fullscreenshot;
    }
}
