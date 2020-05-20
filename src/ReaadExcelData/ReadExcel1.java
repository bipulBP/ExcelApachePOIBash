package ReaadExcelData;

import libraryLib.ReadExcelBase;

public class ReadExcel1 extends ReadExcelBase {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ReadExcelBase obj1 = new ReadExcelBase();
		
		ReadExcelBase obj2 = new ReadExcelBase("C:\\\\Users\\\\Biplab\\\\selenium jar2\\\\ExcelData\\\\TestData.xlsx");
		String data0 = obj2.getData(0, 0, 0);
		System.out.println(data0);
		
		

	}

}
