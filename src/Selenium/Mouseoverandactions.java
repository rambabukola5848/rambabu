package Selenium;

import java.time.Duration;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverandactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	    // Alert ram = driver.switchTo().alert();
	    // driver.switchTo().alert().accept();
	     Actions obj1= new Actions(driver);
	  obj1.moveToElement(driver.findElement(By.id("searchDropdownBox"))).click().build().perform();
	  obj1.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("Amazonpharmacy").doubleClick().build().perform();
	 obj1.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();
	 
	 
	}
}
