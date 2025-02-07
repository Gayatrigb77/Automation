package AlertsorPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup1 {
	public static void main(String[] args) {
		
		//simple program of selenium
		//popoup wndow xpath finable so dont neet to switch to alert
		//Perform the action using java scrip executor if the action cant not perform using sendkey or clic
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.bigbasket.com/");
			driver.findElement(By.xpath("//button[contains(text(),'Login/ Sign Up')]")).click();

			driver.findElement(By.xpath("//label[@for=\"multiform\"]")).sendKeys("TEst@gmail.com");

			driver.findElement(By.xpath("//div[@class=\"absolute top-0 right-0\"]")).click();
			driver.close();
			}
	}

