package ihubbusiness.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.Registration;
import ihubbusiness.pageobjects.baseclass;
import ihubbusiness.pageobjects.login;

public class web_registration extends baseclass {


@Test(dataProvider = "reg", dataProviderClass  = data.class)
  public void f(String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q) {
	  login lo = new login(driver);
	  Registration r = new Registration(driver);
	  
	  driver.get("http://192.168.7.5/iHubBusinessWeb");
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  
	  login.register.click();
	  Registration.reg(b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q);
	  
	  
  }
}
