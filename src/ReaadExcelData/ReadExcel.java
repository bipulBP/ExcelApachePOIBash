package ReaadExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		File src = new File("C:\\Users\\Biplab\\selenium jar2\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		//@SuppressWarnings("resource")
		XSSFWorkbook xxb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = xxb.getSheetAt(0);
		String data111 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data111);
		xxb.close();

	}

}
