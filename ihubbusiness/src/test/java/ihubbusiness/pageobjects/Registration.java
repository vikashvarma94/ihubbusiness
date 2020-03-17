package ihubbusiness.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[4]")
	static WebElement business;

	@FindBy(xpath ="(//input[@type=\"text\"])[5]")
	static WebElement name;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[6]")
	static WebElement mobile;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[7]")
	static WebElement reg_no;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[8]")
	static WebElement pan;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[9]")
	static WebElement gst;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[11]")
	static WebElement website;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[12]")
	static WebElement alt_phone;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[13]")
	static WebElement pincode;
	
	@FindBy(xpath ="(//input[@type=\"email\"])[1]")
	static WebElement email;
	
	@FindBy(xpath ="//textarea[@placeholder=\"Address \"]")
	static WebElement address;
	
	@FindBy(xpath ="(//button[@type=\"submit\"])[2]")
	static WebElement register;
	
	@FindBy(xpath ="(//div/select)[1]")
	static WebElement type_of_business;
	
	@FindBy(xpath ="(//div/select)[2]")
	static WebElement state;
	
	@FindBy(xpath ="(//div/select)[3]")
	static WebElement distict;
	
	@FindBy(xpath ="(//div/select)[4]")
	static WebElement mandal;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[10]")
	static WebElement trading;
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);
	}
	
	public static void reg(String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q) {
		business.sendKeys(b);
		name.sendKeys(c);
		mobile.sendKeys(d);
		email.sendKeys(e);
		
		Select s = new Select(type_of_business);
		s.selectByVisibleText(f);
		
		reg_no.sendKeys(g);
		pan.sendKeys(h);
		gst.sendKeys(i);
		trading.sendKeys(j);
		
		website.sendKeys(k);
		alt_phone.sendKeys(l);
		address.sendKeys(m);
		
		Select s1 = new Select(state);
		s1.selectByVisibleText(n);
		
		Select s2 = new Select(distict);
		s2.selectByVisibleText(o);
		
		Select s3 = new Select(mandal);
		s3.selectByVisibleText(p);
		
		pincode.sendKeys(q);
		
		driver.findElement(By.xpath("(//i[@class=\"check\"])[1]")).click();
		register.click();
		
	}}
	
	
	