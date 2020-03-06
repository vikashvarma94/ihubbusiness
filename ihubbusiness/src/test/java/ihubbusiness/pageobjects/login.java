package ihubbusiness.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ihubbusiness.dataprovider.data;

public class login extends data{
	 
	public static WebDriver driver;
	
	@FindBy(name="userName")
	static WebElement username;
	
	@FindBy(name="password")
	static WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	static WebElement submit;

	

	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);
	}

	public static void signin(String u,String p) {
		username.sendKeys(u);
		password.sendKeys(p);
		submit.click();
	}
	
	public static void setup(String browser,String url) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else {
			System.out.println("No driver found");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
