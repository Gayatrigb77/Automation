package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.events.EventException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization2 {
	public static void main(String[] args) throws EventException,IOException {

	FileInputStream File1 = new FileInputStream("C://Users//gagan//Desktop//XceelData//Test Data.xlsx");
	String Username =

	WorkbookFactory.create(File1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

	FileInputStream File2= new FileInputStream("C://Users//gagan//Desktop//XceelData//Test Data.xlsx");

	String Password =WorkbookFactory.create(File2).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();

	System.out.println(Username);
	System.out.println(Password);
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(Username);
	driver.findElement(By.id("pass")).sendKeys(Password);
	}
	}

