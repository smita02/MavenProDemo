package com.dataproviderdemo.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "pincodes Data")
	public String[][] pincodeData() {
		String[][] pincodes = { { "410002" }, { "411003" }, { "411004" }, { "411005" } };
		return pincodes;

	}
	// @DataProvider(name= "user Data")
	// public Object [][] userData(){

	// }

	public static void redExcel() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Smita\\Java Practice\\Pincode.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 1; j < row.getLastCellNum(); j++) {
			XSSFCell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			System.out.print(data + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] arges) throws IOException {
		redExcel();
	}

}
