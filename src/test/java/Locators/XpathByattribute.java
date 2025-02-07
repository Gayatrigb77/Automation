package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByattribute {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
	Thread.sleep(2000);
	driver.close();
}
}
