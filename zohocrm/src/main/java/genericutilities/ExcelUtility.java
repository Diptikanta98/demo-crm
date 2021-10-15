package genericutilities;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility implements IpathConstant {
	
	
	/*
	 * author @ Dipti
	 */
	/**
	 * This method used to read data from excel by specifying Sheetname, row number and cell number
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable 
	 * @throws EncryptedDocumentException 
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, Throwable {
		FileInputStream file=new FileInputStream(excelfilepath);
		
		
		
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rownum);
		
		Cell ce=row.getCell(cellnum);
		
		return ce.getStringCellValue();
		
		
		
		
		
		
		
		
		
	}

}
