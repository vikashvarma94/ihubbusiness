package ihubbusiness.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data {
	

	
	@DataProvider(name="vikas")
		public Object[][] data() throws IOException  {
		
		
		FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheetAt(0);
			
		Object[][] d =new Object[1][4];
			
		for(int i =1;i<=1;i++) {
			for(int j=1 ;j<5;j++) {
				
			d[i-1][j-1] = sh.getRow(i).getCell(j).getStringCellValue();				
		}
			}
		return d;	
		} 
	

@DataProvider(name="web")
public Object[][] data1() throws IOException  {


FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
HSSFWorkbook wb = new HSSFWorkbook(fis);
HSSFSheet sh = wb.getSheetAt(1);
	
Object[][] d =new Object[1][4];
	
for(int i =1;i<=1;i++) {
	for(int j=1 ;j<5;j++) {
		
	d[i-1][j-1] = sh.getRow(i).getCell(j).getStringCellValue();				
}
	}
return d;	
} 



@DataProvider(name="reg")
public Object[][] data2() throws IOException  {


FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
HSSFWorkbook wb = new HSSFWorkbook(fis);
HSSFSheet sh = wb.getSheetAt(2);
	
Object[][] d =new Object[1][16];
	
for(int i =1;i<=1;i++) {
	for(int j=1 ;j<17;j++) {
		
	d[i-1][j-1] = sh.getRow(i).getCell(j).getStringCellValue();				
}
	}
return d;	
} 
}