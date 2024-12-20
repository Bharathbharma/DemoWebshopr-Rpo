package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovder {
	
	@DataProvider(name="testuserid")
	public String[][] getdata() throws IOException
	{
		String path=".\\test_data\\testid.xlsx";
		String sheetname = "sheet1";
		excel_utilities eu=new excel_utilities(path);
		int rowc=eu.getRowCount("sheet1");
		int colc=eu.getCellCount(path, rowc);
		String[][] logingdata= new String[rowc][colc];
		
		for(int r=1;r<=rowc;r++)
		{
			for(int c=0;c<colc;c++)
			{
				logingdata[r-1][c]=eu.getCellData("sheet1", r, c);
			}
		}
		return logingdata;
	
	}
}
