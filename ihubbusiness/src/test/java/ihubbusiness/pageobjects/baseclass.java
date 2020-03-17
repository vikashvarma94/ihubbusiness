package ihubbusiness.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import ihubbusiness.dataprovider.data;

public class baseclass {
public static WebDriver driver;


	@BeforeTest
	
	public void setup() {
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		  
		  else if(browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
		  }
	}
	
	@AfterTest
	public void close() {
		//driver.close();
	}
}
