package seleniumPractice;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PracticeFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko. deepika","C:\\Users\\ramba\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	     WebDriver deepika = new FirefoxDriver();
	   deepika.get("https://www.facebook.com/");
	    
	     //System.out.println(deepika .getTitle());
	     //System.out.println(deepika .getCurrentUrl());
	}

}
