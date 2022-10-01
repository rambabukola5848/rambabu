package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
public class WindowsHandling {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    driver.get("https://www.rahulshettyacademy.com/loginpagePractise/"); 
	   driver.manage().window().maximize();	
	   driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	Set<String> window  =driver.getWindowHandles();      
			Iterator<String> ram =window.iterator();
			String currentwindow=ram.next();
			String nextwindow=ram.next();
			String thirdwindow=ram.next();			
			driver.switchTo().window(nextwindow);
           //like example =driver.switchTo().window(thirdwindow);
			driver.findElement(By.cssSelector(".im-para.red")).getText();
		//driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
		//System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String name= driver.findElement(By.cssSelector(".im-para .red")).getText().split("with")[0].trim().split("at")[1].trim();
          System.out.println(name);
          Thread.sleep(2000);
          driver.switchTo().window(currentwindow);
          driver.findElement(By.id("username")).sendKeys(name);
			//driver.quit();
			
	}

}
