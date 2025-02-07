package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//XpathByContains2 
//tagname[contains(text(),'text value')]

public class XpathByContains2 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[contains(text(),\"Forgotten password?\")]")).click();
	}
}
