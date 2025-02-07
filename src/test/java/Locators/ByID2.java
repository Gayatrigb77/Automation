package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByID2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup(); 
   WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://app.hubspot.com/login/legacy"); 
	Thread.sleep(5000); 
	driver.findElement(By.id("username")).sendKeys("velcoity@gmail.com"); 
	driver.findElement(By.id("password")).sendKeys("RTYUI"); 
	driver.findElement(By.id("loginBtn")).click(); 
	Thread.sleep(8000); 
	driver.close(); 
	} 
	
}

