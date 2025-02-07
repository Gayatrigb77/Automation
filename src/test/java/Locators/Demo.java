package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}
}
