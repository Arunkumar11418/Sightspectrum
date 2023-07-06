package exceldata.ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchExcelData {
	public static void main(String[] args) throws IOException {
		
	
	
	 
		
		String filelocation = "./Logindata/ExcelData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(filelocation);
	XSSFSheet sheet=	workbook.getSheetAt(0);
for (int i = 1; i <=2; i++) {
	XSSFRow row = sheet.getRow(i);
	
	for (int j = 0; j < 2; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
	
	} 
	
}
workbook.close();
 
 
		
		
		
		
		
		
		
	}
		
	}

