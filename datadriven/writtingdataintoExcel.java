package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writtingdataintoExcel {

	public static void main(String[] args) throws IOException {
		 //ExcelFIle>>WorkBOOK>>Sheet>>Row>>cell
       FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test_data\\myfile.xlsx");
     	XSSFWorkbook workbook=new XSSFWorkbook();
    	XSSFSheet sheet=workbook.createSheet("Data");
    	XSSFRow row1=sheet.createRow(0);
    	row1.createCell(0).setCellValue("Java");
    	row1.createCell(1).setCellValue("1234");
    	row1.createCell(2).setCellValue("Selenium");
    	row1.createCell(3).setCellValue("Automation");
    	
    	XSSFRow row2=sheet.createRow(1);
    	row2.createCell(0).setCellValue("Python");
    	row2.createCell(1).setCellValue("3");
    	row2.createCell(2).setCellValue("Dev");
    	row2.createCell(3).setCellValue("Full stack");
    	
    	XSSFRow row3=sheet.createRow(2);
    	row3.createCell(0).setCellValue("HTML");
    	row3.createCell(1).setCellValue("14");
    	row3.createCell(2).setCellValue("dev pro");
    	row3.createCell(3).setCellValue("Frontend");
    	
    	workbook.write(file);
    	workbook.close();
    	file.close();
    	
    	System.out.println("File is created......");
    	
    	

	}

}
