package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBycontains1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String Text=driver.findElement(By.xpath("//h2[contains(text( ),'Facebook')]")).getText();
		System.out.println(Text);
		
		if(Text.equals("Facebook helps you connect and share with the people in your life.")) {
		System.out.println("Correct text");	
		}
		else {
			System.out.println("Incorrect Text");
		}
	}}
