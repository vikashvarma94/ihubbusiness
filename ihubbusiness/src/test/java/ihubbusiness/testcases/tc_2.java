package ihubbusiness.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.login;

public class tc_2 {
  @Test(dataProvider="vikas")
  public void f(String user,String pass,String test) throws IOException {
	
	System.out.println(user);
	  	  
  }

@DataProvider(name="vikas")
//public Object[][] testdata() throws IOException {
public Object[][] data() throws IOException {
	int i;
	Object[][] d = new Object[2][3];
	
		FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheetAt(0);
	for(i =0;i<=sh.getLastRowNum();i++) {
		d[i][0] = sh.getRow(i).getCell(1).getStringCellValue();
		d[i][1] =sh.getRow(i).getCell(2).getStringCellValue();
		d[i][2] = "vikas";
 return d;
	}

	return d;}}