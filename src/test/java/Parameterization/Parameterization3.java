package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization3 {
	public static void main(String[] args) throws IOException {
		//String path = "/Users/ranjeetkendre/eclipse-workspace/14_Sep_Automation/TestData/Country.xlsx";

		FileInputStream file = new FileInputStream("C:\\Users\\gagan\\eclipse-workspace\\Automation\\TestData\\Data.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet Sheet = work.getSheet("Country Name");
		int Rows = Sheet.getLastRowNum();
		int Col =Sheet.getRow(1).getLastCellNum();
		System.out.println(Rows);
		System.out.println(Col);
		for(int R=0 ;R<=Rows ;R++) { //Rows
		XSSFRow row = Sheet.getRow(R);
		for(int C=0 ;C<Col ;C++) {

		
		XSSFCell cell =row.getCell(C); //0,1 0,2 3<3 - False

		//0,0
		switch (cell.getCellType()) { //Cap
		//String
		case STRING:
		System.out.print(cell.getStringCellValue()); //

		break;
		case NUMERIC:
		double D1=cell.getNumericCellValue();
		int Test = (int) D1;
		System.out.print(Test);
		break;
		case BOOLEAN:
		System.out.print(cell.getBooleanCellValue());
		break;
		default:
		System.out.print("No data found");
		break;
		}
		System.out.print(" || ");
		}
		System.out.println();
		}
	}
}
