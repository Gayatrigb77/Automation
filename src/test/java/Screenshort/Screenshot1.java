package Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.pwa.model.FileHandlerAccept;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//to take the screesnhots
	File S1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String ImgName = "KiteZeroda";
	System.out.println(S1);
	File S2 = new File("C:\\Users\\gagan\\Desktop\\Test.jpg");
	org.openqa.selenium.io.FileHandler.copy(S1, S2);
	driver.close();
	
}
}
