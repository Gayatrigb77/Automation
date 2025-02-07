package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file= new FileInputStream("C://Users//gagan//Desktop//XceelData//Test Data.xlsx");
	String Data  =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();	
	System.out.println(Data);
	
	FileInputStream file1= new FileInputStream("\\Users\\gagan\\Desktop\\XceelData\\Untitled.xlsx");
	
	String Data1  =WorkbookFactory.create(file1).getSheet("Worlddata").getRow(1).getCell(0).getStringCellValue();	
    System.out.println(Data1);

	FileInputStream file3= new FileInputStream("\\Users\\gagan\\Desktop\\XceelData\\StudentNumber.xlsx");

	double Data3  =WorkbookFactory.create(file3).getSheet("StudentNO").getRow(1).getCell(2).getNumericCellValue();	
	System.out.println(Data3);

	int data2 = (int) Data3; //data coversion double to int
	System.out.println(data2);

	FileInputStream file4= new FileInputStream("\\Users\\gagan\\Desktop\\XceelData\\booleanData.xlsx");

	boolean Test3=WorkbookFactory.create(file4).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();

	System.out.println(Test3);
	}
	
}
