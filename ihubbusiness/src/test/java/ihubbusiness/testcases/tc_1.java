package ihubbusiness.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.baseclass;
import ihubbusiness.pageobjects.login;

public class tc_1 extends baseclass {
	@Test//(dataProvider ="vikas", dataProviderClass = data.class)
	public void test() throws IOException {
		driver.get("http://192.168.7.5/iHubbusiness");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login l = new login(driver);
		l.signin("superadmin@ihubstores.in", "Store.123");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("ihubbussiness"));
	}}



