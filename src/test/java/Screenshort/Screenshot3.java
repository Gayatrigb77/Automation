package Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot3 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String Test ="Facebook";
	Screenshot3.TakeScreenshot(Test);
	Screenshot3.TakeScreenshot(Test);
	ChromeDriver chromeDriver = new ChromeDriver();
	chromeDriver.close();
	}
	public static void TakeScreenshot(String text) throws IOException {

	

	String Random =RandomString.make(10);
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Dest = new File("C:\\Users\\gagan\\Desktop\\14Sep\\"+text+"_"+Random+".jpg");
	org.openqa.selenium.io.FileHandler.copy(Source, Dest);
	}
	}


