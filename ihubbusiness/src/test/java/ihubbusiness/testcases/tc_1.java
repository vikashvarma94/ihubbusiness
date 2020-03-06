package ihubbusiness.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.baseclass;
import ihubbusiness.pageobjects.home_page;
import ihubbusiness.pageobjects.login;

public class tc_1 extends baseclass {
	
	@Test(dataProvider ="vikas", dataProviderClass = data.class)
	
	public void test(String browser,String url,String u,String p) throws IOException, InterruptedException {
		login l = new login(driver);
		home_page h = new home_page(driver);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	login.setup(browser, url);
		
		login.signin(u,p);

		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("ihubbussiness"));	
		
		Thread.sleep(5000);
		home_page.pushmenu.click();
		home_page.masters.click();
	}
}
