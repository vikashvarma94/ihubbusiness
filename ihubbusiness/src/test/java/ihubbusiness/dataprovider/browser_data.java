package ihubbusiness.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

public class browser_data {
	@DataProvider(name="browser")
public Object[][] data() throws IOException  {
	
	
FileInputStream fis  = new FileInputStream("C:\\Users\\VIKAS\\Desktop\\testdata.xls");
HSSFWorkbook wb = new HSSFWorkbook(fis);
HSSFSheet sh = wb.getSheetAt(0);
	
Object[][] d =new Object[sh.getLastRowNum()][1];
	
for(int i =1;i<=sh.getLastRowNum();i++) {
	for(int j=2 ;j<3;j++) {
		
	d[i-1][j-1] = sh.getRow(i).getCell(j).getStringCellValue();				
}
	}
return d;	
} 
}


