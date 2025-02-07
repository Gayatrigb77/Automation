package Screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot5 {
	
		public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement FacebookLogo =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilhimg\"]"));
		File Src=((TakesScreenshot)FacebookLogo).getScreenshotAs(OutputType.FILE);

		String Random = RandomString.make(10);
		String Facebook = "Test";

		File Dest = new File("\\Users\\gagan\\eclipse-workspace\\Automation\\src\\test\\resources\\Automation\\Screnshorts\\"+Facebook+"_"+Random+".jpg");

		

		FileUtils.copyFile(Src, Dest);
		driver.close();

		}
}
