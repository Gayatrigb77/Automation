package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByID {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup(); 
	
	ChromeDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://www.flipkart.com/"); 
	// (xpathexpression)[indexnumber];
	// driver.findElement(By.xpath("//a[@class=\"nav-a \"]")).click();
	// driver.findElement(By.xpath("(//a[@class=\"nav-a \"])[8]")).click();
	driver.findElement(By.xpath("(//span[@class=\"_1XjE3T\"])[7]")).click();
}
}
