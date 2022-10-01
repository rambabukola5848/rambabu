package seleniumPractice;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class abhibusjurney {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://www.abhibus.com/");
	     
	    driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 ui-autocomplete-input']")).sendKeys("VIZ");
	    List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	    for(WebElement option:options) {
	    	if(option.getText().equalsIgnoreCase("Vizag")) 
	    	{
	   		option.click();}
	    }//break; 			   
	    driver.findElement(By.cssSelector("input[id='destination']")).sendKeys("Visakhapatnam"); 
	    
	       	
	}   		     
	}


	


	    			    
   	
	    
	
	    
	    
	
	    	

	    	
	

	    
	    	
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

