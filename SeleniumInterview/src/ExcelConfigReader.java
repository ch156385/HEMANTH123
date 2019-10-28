import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfigReader {
XSSFWorkbook wb;
XSSFSheet Sheet1;

public ExcelConfigReader(String excelpath){
	try
	{
		File src = new File(excelpath);
		FileInputStream fs = new FileInputStream(src);
		wb = new XSSFWorkbook(fs);
	}
	catch(Exception e){
		System.out.println(e.getLocalizedMessage());
	}
}
public String getdata(int sheetNumber, int row , int colum){
	Sheet1 = wb.getSheetAt(sheetNumber);
	String data = Sheet1.getRow(row).getCell(colum).getStringCellValue();
	return data;
}
public int getRowCount(int sheetindex){

int row = 	wb.getSheetAt(sheetindex).getLastRowNum();
	row = row+1;
	return row;
}
}
