package ihubbusiness.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ihubbusiness.dataprovider.data;

public class login extends data{
	 
	public WebDriver driver;
	@FindBy(name="userName")
	static WebElement username;
	
	@FindBy(name="password")
	static WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
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
}
