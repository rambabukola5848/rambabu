package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertingmsgorpopopbox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://demoqa.com/alerts");
	     driver.getTitle();
	     //1)alertbox
	     driver.findElement(By.id("alertButton")).click();
	     Thread.sleep(2000);
	    
	     driver.switchTo().alert().accept();
	    //2)confirmbox
	    // Thread.sleep(2000);
	    // driver.findElement(By.id("timerAlertButton")).click();
	    // driver.switchTo().alert().accept();
	      driver.findElement(By.id("confirmButton")).click();   
	      driver.switchTo().alert().accept();
	     Thread.sleep(3000);
	     //driver.switchTo().alert().dismiss();
	    // 3)promptmethod;
	     //driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	     driver.findElement(By.id("promtButton")).click();  
	     driver.switchTo().alert().sendKeys("Deepika");  
	    driver.switchTo().alert().accept();
	  //  driver.findElement(By.id("promtButton")).click();
	    // driver.switchTo().alert().dismiss();
	     driver.quit();
	     
	    
	     
	}

}
