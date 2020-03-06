package ihubbusiness.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@data-widget=\"pushmenu\"]")
	public static WebElement pushmenu;
	
	@FindBy(xpath="//div/li[1]")
	 WebElement dashboard;
	
	@FindBy(xpath="//div/li[2]")
	public
	static WebElement masters;
	
	@FindBy(xpath="//div/li[3]")
	static WebElement categorey_management;
	
	@FindBy(xpath="//div/li[4]")
	static WebElement product_management;
	
	@FindBy(xpath="//div/li[5]")
	static WebElement price_management;
	
	@FindBy(xpath="//div/li[6]")
	static WebElement Inventory_management;
	
	@FindBy(xpath="//div/li[7]")
	static WebElement order_management;
	
	@FindBy(xpath="//div/li[8]")
	static WebElement account_management;
	
	@FindBy(xpath="//div/li[9]")
	static WebElement home_page;
	
	@FindBy(xpath="//div/li[10]")
	static WebElement inflow_outflow;
	
	@FindBy(xpath="//div/li[10]")
	static WebElement role_mapping;
	
	@FindBy(xpath="//div/li[10]")
	static WebElement update_stock;

	
	public home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);}	
}
