package com.bridgelabz.facebook.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bridgelabz.facebook.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass{
	public static WebDriver driver;
	public static Properties property;
	public static WebDriverWait wait;
	public static FileInputStream fis;
		public BaseClass() 	{
			property = new Properties();		
				try {
					fis = new FileInputStream("/home/admin1/Downloads/newTest/POM_Sample_Facebook_With_TestNGLister/src/main/java/com/bridgelabz/facebook/config/config.properties");
					property.load(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
	
	public static void initiation() {
		
		if(property.getProperty("browser").equals("chrome")){
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(property.getProperty("URL"));
		//wait = new WebDriverWait(driver,Utility.wait);
		
	}

}