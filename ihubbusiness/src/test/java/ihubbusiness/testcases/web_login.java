package ihubbusiness.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.baseclass;
import ihubbusiness.pageobjects.login;

public class web_login extends baseclass {

  @Test(dataProvider="web", dataProviderClass = data.class)
  
  public void test(String browser,String url,String u,String p) {
	  login l = new login(driver);
	  
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  login.signin(u, p);
	  
  }}
