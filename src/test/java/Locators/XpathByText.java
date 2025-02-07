package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("test");
driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("test123");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Yes, Continue']")).click();
Thread.sleep(2000);
driver.quit();
	
	}

}
