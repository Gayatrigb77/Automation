package Screenshort;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.devtools.v128.page.model.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

		String ImgName = "KiteZeroda";
		//to take the screesnhots
		String Random = RandomString.make(7); //ertyy
		java.io.File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		java.io.File S2= new java.io.File("C:\\Users\\gagan\\Desktop\\14Sep\\"+ImgName+"_"+Random+".jpg");
	org.openqa.selenium.io.FileHandler.copy(S1, S1);
	FileUtils.copyFile(S1, S2);
	driver.close();
		
	
		}
		}
