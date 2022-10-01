package Selenium;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takeasceenshortmain {

	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	     File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(sourcefile, new  File("C:\\screenshort2/img2.jpg"));
	     driver.quit();
	}

}
