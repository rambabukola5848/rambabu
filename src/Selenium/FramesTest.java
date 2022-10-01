package Selenium;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get("https://jqueryui.com/droppable/");
	     driver.manage().window().maximize();
	     System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getTitle());
	     System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));//css selector also used in this type of action
	    driver.findElement(By.id("draggable")).click();
	    Actions ram=new Actions(driver);
	   ram.dragAndDrop( driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	   
	   driver.switchTo().defaultContent() ; 
	     
	     
	     
	}

}
