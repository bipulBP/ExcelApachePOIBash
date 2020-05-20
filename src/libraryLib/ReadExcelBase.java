package libraryLib;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelBase {
       
        
	FileInputStream fis;
	XSSFWorkbook xxb;
	
	
	
	
	public ReadExcelBase() {
		System.out.println("plz specify the path for Excelfile and sheet,row n Column number Respectively ");
		
	}
	
	public ReadExcelBase(String Excelpath) {

		try {

			File src = new File(Excelpath);
			fis = new FileInputStream(src);
		    xxb = new XSSFWorkbook(fis);
           
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}




	}

	
	
	
	
	public String getData(int i,int j,int k) {
		XSSFSheet sheet = xxb.getSheetAt(i);
		String data = sheet.getRow(j).getCell(k).getStringCellValue();
		return data;
	}
	
	
}

