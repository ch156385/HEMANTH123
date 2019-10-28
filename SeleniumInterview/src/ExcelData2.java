import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream; 
import java.io.IOException;  
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.openxml4j.exceptions.InvalidFormatException; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
public class ExcelData2  
{ 
 public static void main(String[] args) throws 
EncryptedDocumentException, InvalidFormatException, IOException 
 { 
  FileInputStream fis=new FileInputStream("C:\\Users\\Hemanth\\Desktop\\Selenium\\SeleniumInterview\\Excel\\Hemanth.xlsx"); 
  Workbook wb=WorkbookFactory.create(fis); 
  for(int i=0;i<=2;i++) 
    { 
   for(int j=0;j<=2;j++) 
   { 
   Cell c = wb.getSheet("Sheet1").getRow(i).getCell(j); 
   System.out.println(c+" "); 
   } 
  System.out.println(); 
  } 
 } 
}
