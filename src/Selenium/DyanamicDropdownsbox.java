package Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdownsbox {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	     driver.getTitle();
        Thread.sleep(5);
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.xpath("//span[@class='red-arrow-btn']")).click();
       // driver.findElement(By.cssSelector("span[*id=id='_originStation1_CTXTaction')]")).click();
        Thread.sleep(5);
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
     
       driver.findElement(By.xpath("//a[@value='BLR']")).click();
      
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[6]/a")).click();
       //driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a")).click();
       driver.findElement(By.cssSelector("button[class='ui-datepicker-trigger']")).click();
     //  a.move
     // driver.findElement(By.xpath(""))
	}

}