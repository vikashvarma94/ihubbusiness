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
	

	
	@DataProvider(name ="vikas")
	//public Object[][] testdata() throws IOException {
	public Object[][] data() throws IOException {
		Object[][] d = new Object[10][10];
		
			FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sh = wb.getSheetAt(0);
		for(int i =1;i<=sh.getLastRowNum();i++) {
			d[i][1] = sh.getRow(i).getCell(1).getStringCellValue();
			d[i][1] = sh.getRow(i).getCell(2).getStringCellValue();

//    return new Object[][] {
//            { user, pass } };
//		}
//@Test(dataProvider = "vikas")
//public void f() {	

		return d;
}
		return d;}}
