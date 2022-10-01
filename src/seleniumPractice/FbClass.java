package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU3NzAwMjgxLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	     driver.getTitle();
	     driver.findElement(By.id("email")).sendKeys("9010454419");
	     driver.findElement(By.name("pass")).sendKeys("6300305446");
	     driver.findElement( By.name("login")).click();
	     driver.findElement(By.linkText("Forgotten account?")).click();
	     driver.findElement(By.linkText("Sign up for Facebook")).click();
	     
	}

}
