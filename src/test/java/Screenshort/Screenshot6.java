package Screenshort;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot6 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		String ImgName = "KiteZeroda";
		String TimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));

		System.out.println(TimeStamp);
		java.io.File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//File Dest = new File("/Users/ranjeetkendre/eclipse-workspace/14_Sep_Automation/Screenshots/"+ImgName+"_"+TimeStamp+".jpg");

		String path = ".//Screenshots//";
		java.io.File Dest = new java.io.File(path+"_"+ImgName+"_"+TimeStamp+".jpg");
		FileUtils.copyFile(S1, Dest);
		driver.close();
		}}

