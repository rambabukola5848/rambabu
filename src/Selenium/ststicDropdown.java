package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ststicDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		 //System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	     driver.getTitle();
        Thread.sleep(5);
       WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//this condition is when ever drop down box is static
       //-then you dont cliclk on the button then choosen ioption for selenium (selt method)...
        Select Dropdwon =new Select(staticdropdown);//ypu can choosen the select method in selenium then ofter the one object will created
      // Dropdwon.selectByIndex(1);
      // Dropdwon.selectByVisibleText("INR");//you can choosen another method of java
       System.out.println(Dropdwon.getFirstSelectedOption().getText());
       Dropdwon.selectByVisibleText("INR");
       System.out.println(Dropdwon.getFirstSelectedOption().getText());
       Dropdwon.selectByVisibleText("AED");
      // System.out.println(Dropdwon.getFirstSelectedOption().getText());
      // Dropdwon.selectByVisibleText("USD");
       driver.quit();
	}

}
