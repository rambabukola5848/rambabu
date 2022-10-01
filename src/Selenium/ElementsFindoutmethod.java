package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.Firefoxdriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ElementsFindoutmethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    // ChromeDriver driver=new ChromeDriver();
	    // System.setProperty("chromedriver, null)
	    
	     System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://github.com/login");
	     driver.getTitle();
	     Thread.sleep(3000);
	     driver.manage().window().maximize();
	     //driver.findElement(By.id("login_field"));
	     highlight (driver,driver.findElement(By.id("login_field")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.name("password")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.className("header-logo")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.name("Forget password?")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.partialLinkText("creat an")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.tagName("h1")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.cssSelector("input[name='commit']")));
	     Thread.sleep(3000);
	     highlight(driver,driver.findElement(By.xpath("//lable[contains(text(),'Username or email address')]")));
	  //   System.out.println(driver.getTitle());
	  //   System.out.println(driver.getCurrentUrl());
	}

	private static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jeExecutor=(JavascriptExecutor)driver;
		jeExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')",element);
	}

	
	}

  
