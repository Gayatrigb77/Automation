package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class by_ID {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://practicetestautomation.com/practice-testlogin/"); 
	driver.findElement(By.id("username")).sendKeys("student"); 
	driver.findElement(By.id("password")).sendKeys("Test@123"); 
	driver.findElement(By.id("submit")).click(); 
	String Text =driver.findElement(By.xpath("//div[contains(text(),'Your password is invalid!')]")).getText(); 
	if(Text.equals("Your password is invalid!")) { 
	System.out.println("Pass");
	} 
	else { 
	System.out.println("Fail"); 
	} 
}
}