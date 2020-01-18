package com.bridgelabz.facebook.util;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.bridgelabz.facebook.base.BaseClass;


public class Utility extends BaseClass {

    public static void captureScreenShot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("/home/admin1/Downloads/newTest/POM_Sample_Facebook_With_TestNGLister/src/main/resources/ScreenShots/" + screenshotName + ".png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
