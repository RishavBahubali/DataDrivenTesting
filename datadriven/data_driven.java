package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_driven {

	public static void main(String[] args) throws IOException {
		
		
 //ExcelFIle>>WorkBOOK>>Sheet>>Row>>cell
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\Test_data\\TesDatata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int totalrows=sheet.getLastRowNum();
	int totalcell=sheet.getRow(1).getLastCellNum();	
	System.out.println("number of rows:"+ totalrows);//4
	System.out.println("number of cells:"+ totalcell);//4

	for(int r=0;r<=totalrows;r++)
	{
		XSSFRow CurrentRow=sheet.getRow(r);
		
		
		for(int c=0;c<totalcell;c++)
		{
			XSSFCell Cell=CurrentRow.getCell(c);
			System.out.print(Cell.toString()+"\t");
		}
		System.out.println();
	}
	workbook.close();
	file.close();
	}

}
