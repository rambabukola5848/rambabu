package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestedDropDownbox {

	public static void main(String[] args) throws Throwable{
		// Auto suggested drop down means its can multiple valus selected int his method like india,indonesia...
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	     driver.getTitle();
		
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2);
		//driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
		//driver.findElements(By.xpath("//a[@class='ui-corner-all']"));//its not required
		List<WebElement> options =driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		//List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India") )
			{
			
			option.click();
			break;
		}
		
	}
	}
}
	
