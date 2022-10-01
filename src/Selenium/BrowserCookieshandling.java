package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.CookieParam;

public class BrowserCookieshandling {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32 (1)\\ChromeDriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    // driver.get("https://www.facebook.com/");
	    driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     driver.manage().getCookies();
	     Set<Cookie> raju= driver.manage().getCookies();//capture all cookies on the browseer
	     System.out.println("size of the cookie;"+ raju.size());//print size of the cookies
	     for(Cookie ram :  raju) //print read all the cookies
	     {
	    	 System.out.println(ram.getName()+ram.getValue());//prints name and value of the cookies
	     }
	    //example;
	   // System.out.println(driver.manage().getCookieNamed("Asia.Calcutta"));//cookie name of full details
	     //how add cookies our broweser let see
	     Cookie obj1=new Cookie("rambabu cookies 143","12345654");//add cookies ids
	     driver.manage().addCookie(obj1);
	     raju=driver.manage().getCookies();
	     System.out.println("size of the cookie;"+ raju.size());
	     for(Cookie ram :  raju) //print read all the cookies
	     {
	    	 System.out.println(ram.getName()+ram.getValue());//prints name and value of the cookies
	     }
	     
	     driver.manage().deleteCookieNamed("Asia.Calcutta");//special cookies name 
	     driver.manage().deleteCookieNamed("PREFf4=4000000&tz");//cookie session id name
	    driver.manage().deleteAllCookies();//in this only how delete all cookies in web site
	     driver.close();
	}     
	  

}
     