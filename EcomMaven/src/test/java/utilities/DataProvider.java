package utilities;

import java.io.IOException;

public class DataProvider {

	// Data provider 1

	@org.testng.annotations.DataProvider(name="LoginData")

	public String[][] getData() throws IOException  {
		String path = ".\\testData\\OpenCart_LoginData.xlsx";// taking excel file from testData

		ExcelUtility xlutil = new ExcelUtility(path);// creating the object of ExcelUtility
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String logindata[][] = new String[totalrows][totalcols];// created for two dimensional array

		for (int i = 1; i <= totalrows; i++)// read the data from xl storing i as rows value ,in excel 1st row is header hence row_number starts from 1
		{
			for (int j = 0; j < totalcols; j++) // j values are columns
			{
				logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j); // 1,0
			}

		}
		return logindata; // return two dimentional array

	}

	// dataprovider 2
	// dataprovider 3
	// dataprovider 4

}
