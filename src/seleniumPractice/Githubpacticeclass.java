package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githubpacticeclass {

	private static Object commit;

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     Thread.sleep(3000);
	     driver.get("https://github.com/login");
	     driver.getTitle();
	     driver.findElement(By.name("login")).sendKeys("rmbabu");
	     Thread.sleep(3000);
	     driver.findElement(By.id("password")).sendKeys("rmbabu143");
	     Thread.sleep(3000);
	     driver.findElement(By.className("header-logo")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.linkText("Forgot password?")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.partialLinkText("Create an account")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.tagName("h1")).click();
	     Thread.sleep(3000);
	   //  driver.findElement(By.cssSelector(inpu(commit)))
	}

}
