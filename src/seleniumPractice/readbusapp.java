package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class readbusapp {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://www.redbus.in/");
	     driver.manage().window().maximize();
	     
	   //  driver.findElement(By.id("src")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("src")).sendKeys("AMPLA");
	List<WebElement>raju =driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[1]"));
	 for(WebElement option :raju) {
	    	if(option.getText().equalsIgnoreCase("Amalapuram")) 
	    	{
	   		option.click();
	    //break; 		
	    driver.findElement(By.id("dest")).sendKeys("viz");
	    List<WebElement>ramu=driver.findElements(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[1]"));
	    for(WebElement op :ramu) {
	    	if(op.getText().equalsIgnoreCase("Vizag")) 
	    	{
	   		op.click();
	   		//break;
	   		//driver.findElement(By.xpath("td(@classs='we day']")).click();
	   		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
	   	
	   		driver.findElement(By.xpath("//*[@id='search']/div/div[4]/span")).click();
	   		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[7]")).click();
	   		driver.findElement(By.id("search_btn")).click();
	   		driver.findElement(By.cssSelector("div[class*='btn g-button clearfix fl']")).click();
	   		//okey method
	   		Assert.assertFalse( driver.findElement(By.cssSelector("label[class='custom-checkbox']")).isSelected());
	   		System.out.println(driver.findElement(By.cssSelector("label[class='custom-checkbox']")).isSelected());
	   		Thread.sleep(2000);
	   		driver.findElement(By.className("custom-checkbox")).isSelected();
	   		Thread.sleep(2000);
	   		driver.findElement(By.cssSelector("i[class='icon icon-cross']")).click();
	   		Thread.sleep(2000);
	   		driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]/label[1]")).click();
	   		Thread.sleep(2000);
	   		//driver.findElement(By.xpath("//*[@id=\"17284212\"]/div/div[2]/div[1]")).click();
	   		driver.findElement(By.xpath("//*[@id=\"8655099\"]/div/div[2]/div[1]")).click();
	   		Thread.sleep(2000);
	   		System.out.println(driver.findElements(By.xpath("ul[@class='list-chkbox']")).size());
	}
}
	    	}
	 }
	}
}