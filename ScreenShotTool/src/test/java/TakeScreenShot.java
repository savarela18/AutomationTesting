import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public String captureScreen(WebDriver driver) {

        String path;

        try {

            File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            path = "C:\\" + source.getName();
            FileUtils.copyFile(source, new File(path));
        }
        catch(IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }
        return path;
    }
}
