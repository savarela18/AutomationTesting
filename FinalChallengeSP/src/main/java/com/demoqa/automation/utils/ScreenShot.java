package com.demoqa.automation.utils;

import com.demoqa.automation.models.DataInjection;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;

public class ScreenShot {



    public static void takeScreenShot(WebDriver driver){

        DataInjection dataInjection = new DataInjection();
        String path;
        File srcShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        path = dataInjection.getDestPath() + srcShot.getName();
        try {
            FileUtils.copyFile(srcShot,new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
