package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;      
public class findoutcheckbox {
	

	public static void main(String[] args) throws Throwable  {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	     driver.getTitle();
         Thread.sleep(10);
         //asseert condtion you can find out the boolen function..incase test false then go to click,next condtion when its click button then ofter check proceess
    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
      
    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
   // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    
    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    
   System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
   
  
    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		

	
	}
	}
		
	


