package Locators;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByattributes2 {
public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Gayatri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Bhoyar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("ghatanighfk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("gg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.quit();
}
}
