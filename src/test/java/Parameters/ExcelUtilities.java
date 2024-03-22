package Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	XSSFWorkbook Wb;
	XSSFSheet sheet;
	
	public ExcelUtilities(String Excelfilepath){
		
		try {
			File file=new File(Excelfilepath);
			FileInputStream file_stream;
			file_stream = new FileInputStream(file);
			Wb=new XSSFWorkbook(file_stream);
		}
			catch (Exception e) 
			{
			   System.out.println(e.getMessage());		 
			}
		}
	public String getdata(int sheetno,int row,int cell){
		sheet=Wb.getSheetAt(sheetno);
		String data=sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetindex){
		int row=Wb.getSheetAt(sheetindex).getLastRowNum();
		//row+=1;
		return row;
	}
	}

		
		
	
	

