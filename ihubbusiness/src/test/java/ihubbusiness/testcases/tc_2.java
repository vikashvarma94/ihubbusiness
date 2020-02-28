package ihubbusiness.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

import ihubbusiness.dataprovider.data;
import ihubbusiness.pageobjects.login;

public class tc_2 {
	
	

  @Test(dataProvider="vikas")
  public void f(String user,String pass) throws IOException {
	
	System.out.println(user);
	System.out.println(pass);
	  	  
  }

@DataProvider(name="vikas")
//public Object[][] testdata() throws IOException {
public Object[][] data() throws IOException  {
	
	
	FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet sh = wb.getSheetAt(0);
		
	Object[][] d =new Object[sh.getLastRowNum()][2];
		
	for(int i =1;i<=sh.getLastRowNum();i++) {
		for(int j= 0;j<2;j++) {
			
		d[i-1][j] = sh.getRow(i).getCell(j).getStringCellValue();
				
	}
		}
	return d;
	
	
	} 
}
