package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserandwebidentify {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    driver.get("https:www.google.com"); 
	   driver.manage().window().maximize();
	  driver.navigate().to("https:www.youtube.com");
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
	   driver.quit();
	   
	}

}
