package IFRAME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
	driver.switchTo().defaultContent();

	

	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();	
}
}
