package Selenium;

import java.io.File;

import java.io.IOException;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshort2 {

	public static void main(String[] args)throws IOException {
		WebDriverManager.chromedriver().setup();
		 //System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	    TakeScreenshort2 ram= (TakeScreenshort2) driver;	 
	    File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     File destsource =new  File("C:\\ScreenShort/img1.png");
	   FileUtils.copyFile(sourcefile, destsource);
	   System.out.println("screenshot Sved succesfully");
	   driver.quit();
	  

	     
	    		 
	}

}
