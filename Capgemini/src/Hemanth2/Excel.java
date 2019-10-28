package Hemanth2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public String readData(String pathOfFile,String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(pathOfFile);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNumber);
		return row.getCell(cellNumber).getStringCellValue();	
	}
	public String readNumaricData(String pathOfFile,String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(pathOfFile);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNumber);
		long lg=(long)row.getCell(cellNumber).getNumericCellValue();
		return String.valueOf(lg);
	}
	public void writeData(String pathOfFile,String sheetName,int rowNumber,int cellNumber,String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis=new FileInputStream(pathOfFile);
		  Workbook wb=WorkbookFactory.create(fis);
		  Sheet sh=wb.getSheet(sheetName);
		  Row row=sh.createRow(rowNumber);
		  Cell cell=row.createCell(cellNumber);
		  cell.setCellValue(cell.CELL_TYPE_STRING);
		  FileOutputStream fos=new FileOutputStream(pathOfFile);
		  cell.setCellValue(data);
		  wb.write(fos);
		  wb.close();
	}
}
