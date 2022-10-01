package seleniumPractice;

import java.sql.Driver;

//import java.sql.Driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailpractice {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
		     WebDriver driver = new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		     driver.get("https://retail.onlinesbi.com/retail/login.htm");
		     driver.getTitle();
		    
		     
		     
		     
	}

}
