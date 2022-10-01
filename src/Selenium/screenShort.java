package Selenium;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShort {

	public static void main(String[] args)throws IOException {
		  WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	       // WebDriver driver=new ;
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://www.amazon.com/");
	        driver.manage().window().maximize();
	        File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(Screen,new File("C:\\screenshort2/img1.png"));				
	        driver.quit();
	        
		

	}

}
