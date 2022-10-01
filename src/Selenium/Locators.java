package Selenium;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//implicity means assign at the global level run time may before find the 
		    // -value then move another find locator.explictiy means it doesnt move complite time(its used one particuler page shift time)
		     // thead .sleep means one movement to another movement full time taken.
		     
		     driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		     driver.getTitle();
		     driver.manage().window().maximize();
		     driver.findElement(By.id("inputUsername")).sendKeys("rambabu");
		     driver.findElement(By.name("inputPassword")).sendKeys("rambabu143");
		     driver.findElement(By.className("signInBtn")).click();
		     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		    //driver.findElement(By.cssSelector("p[class='error']")).getText();//incase we get the result also
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(2000);
		     driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Maheshbabu");
		    // driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("maheshbabu");some times we get the resultalso
		     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ramabaukola@223gmail.com");
		     driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//incase inputs same then you can chosen this method
		     Thread.sleep(4000);
		     driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9010454419");
		     //driver.findElement(By.cssSelector("input[type='text']:n-child(3)")).sendKeys("9010454419");
		     //Thread.sleep(3000);
		     driver.findElement(By.className("go-to-login-btn")).click();
		     Thread.sleep(3000);
		    driver.findElement(By.className("reset-pwd-btn")).click();
		    //driver.findElement(By.tagName("Sign in")).click();
		   // driver.findElements(By.tagName("a")).size();
		    int open=  driver.findElements(By.tagName("input")).size();
		    System.out.println("total number of links in rahualshettyacademy page="+open);
		  // driver.findElement(By.xpath("//input[name='email']")).clear();
		    
	}

}
